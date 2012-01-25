package ge.lanmaster.onmap.root.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import ge.lanmaster.onmap.root.client.UserState;

/**
 * Created by IntelliJ IDEA.
 * User: alexander
 * Date: 1/8/12
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */
public interface LoginServiceAsync {
    void login(String requestUri, AsyncCallback<UserState> async);
}
