package ge.lanmaster.onmap.root.server.service;


import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ge.lanmaster.onmap.root.client.entity.UserState;
import ge.lanmaster.onmap.root.client.entity.Visit;
import ge.lanmaster.onmap.root.client.services.LoginService;
import ge.lanmaster.onmap.root.server.manager.VisitorLogger;

import java.util.Date;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {

//    private static final Logger logger = Logger.getLogger(LoginServiceImpl.class.getName());

    public UserState login(String requestUri) {
        final String ip = getThreadLocalRequest().getRemoteAddr();


        UserState userState = new UserState();
        UserService userService = UserServiceFactory.getUserService();

        User user;

        //logger.info("Going to execute userService.getCurrentUser()");
        //logger.info(userService.toString());
        //logger.info("userService.isUserLoggedIn() = "+userService.isUserLoggedIn());
        user = userService.getCurrentUser();

        // log part
        VisitorLogger visitorLogger = new VisitorLogger();
        Visit v;
        // log part

        if (user != null) {
            userState.setLoggedIn(true);
            userState.setLogoutUrl(userService.createLogoutURL(requestUri));
            userState.setNickname(user.getNickname());
            userState.setEmailAddress(user.getEmail());

            // log part
            v = new Visit(user.getEmail(), ip, userService.isUserLoggedIn(), userService.isUserAdmin(), new Date());
        } else {
            userState.setLoggedIn(false);
            userState.setLoginUrl(userService.createLoginURL(requestUri));

            // log part
            v = new Visit("guest", ip, false, false, new Date());
        }

        // log part
        visitorLogger.log(v);

        return userState;
    }

}