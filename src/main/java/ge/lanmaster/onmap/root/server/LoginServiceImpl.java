package ge.lanmaster.onmap.root.server;


import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.appengine.api.users.UserServiceFactory;

import ge.lanmaster.onmap.root.client.LoginInfo;
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

    public LoginInfo login(String requestUri) {
        LoginInfo loginInfo = new LoginInfo();
        UserService userService = UserServiceFactory.getUserService();

        User user;

        //logger.info("Going to execute userService.getCurrentUser()");
        //logger.info(userService.toString());
        //logger.info("userService.isUserLoggedIn() = "+userService.isUserLoggedIn());

        user = userService.getCurrentUser();

        if (user != null) {
            loginInfo.setLoggedIn(true);
            loginInfo.setLogoutUrl(userService.createLogoutURL(requestUri));
            loginInfo.setNickname(user.getNickname());
            loginInfo.setEmailAddress(user.getEmail());
        } else {
            loginInfo.setLoggedIn(false);
            loginInfo.setLoginUrl(userService.createLoginURL(requestUri));
        }

        return loginInfo;
    }

}