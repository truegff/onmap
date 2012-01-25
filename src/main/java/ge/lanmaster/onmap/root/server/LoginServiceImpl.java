package ge.lanmaster.onmap.root.server;


import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.appengine.api.users.UserServiceFactory;

import ge.lanmaster.onmap.root.client.UserState;
import ge.lanmaster.onmap.root.client.services.LoginService;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: alexander
 * Date: 1/8/12
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {

    private static final Logger logger = Logger.getLogger(LoginServiceImpl.class.getName());

    public UserState login(String requestUri) {
        UserState userState = new UserState();
        UserService userService = UserServiceFactory.getUserService();

        User user;

        //logger.info("Going to execute userService.getCurrentUser()");
        //logger.info(userService.toString());
        //logger.info("userService.isUserLoggedIn() = "+userService.isUserLoggedIn());

        user = userService.getCurrentUser();

        if (user != null) {
            userState.setLoggedIn(true);
            userState.setLogoutUrl(userService.createLogoutURL(requestUri));
            userState.setNickname(user.getNickname());
            userState.setEmailAddress(user.getEmail());
        } else {
            userState.setLoggedIn(false);
            userState.setLoginUrl(userService.createLoginURL(requestUri));
        }

        return userState;
    }

}