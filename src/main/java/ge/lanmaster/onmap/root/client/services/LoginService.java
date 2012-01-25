package ge.lanmaster.onmap.root.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import ge.lanmaster.onmap.root.client.UserState;

/**
 * Created by IntelliJ IDEA.
 * User: alexander
 * Date: 1/8/12
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {

    /**
     * Utility/Convenience class.
     * Use LoginService.App.getInstance() to access static instance of loginAsync
     */
//    public static class App {
//        private static final LoginServiceAsync ourInstance = (LoginServiceAsync) GWT.create(LoginService.class);
//
//        public static LoginServiceAsync getInstance() {
//            return ourInstance;
//        }
//    }

    public UserState login(String requestUri);
}
