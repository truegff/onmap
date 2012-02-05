package ge.lanmaster.onmap.root.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import ge.lanmaster.onmap.root.client.entity.UserState;

public interface LoginServiceAsync {
    void login(String requestUri, AsyncCallback<UserState> async);
}
