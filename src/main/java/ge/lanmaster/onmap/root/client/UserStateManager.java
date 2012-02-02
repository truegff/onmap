package ge.lanmaster.onmap.root.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.rpc.AsyncCallback;
import ge.lanmaster.onmap.root.client.services.LoginService;
import ge.lanmaster.onmap.root.client.services.LoginServiceAsync;

/**
 * Created by IntelliJ IDEA.
 * User: alexander
 * Date: 1/24/12
 * Time: 11:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserStateManager {
    ClientFactory clientFactory;
    private UserState userState;
    private boolean isBusy = false;


    public UserStateManager() {
        userState = new UserState();
    }

    public void refReshUserState(final Command failureCase, final Command successCase) {
        isBusy = true;
        LoginServiceAsync loginService = GWT.create(LoginService.class);
        GWT.log("GWT.getHostPageBaseURL() = " + GWT.getHostPageBaseURL());
        try {
            loginService.login(GWT.getHostPageBaseURL(), new AsyncCallback<UserState>()  {
                public void onFailure(Throwable caught) {
                    failureCase.execute();
                }
                public void onSuccess(UserState result) {
                    userState = result;
                    successCase.execute();
                }
            });
        } catch (Exception e) {
            failureCase.execute();
            GWT.log(e.getMessage());
        }
    }

    public UserState getUserState() {
        return userState;
    }

    public boolean isBusy() {
        return isBusy;
    }
}
