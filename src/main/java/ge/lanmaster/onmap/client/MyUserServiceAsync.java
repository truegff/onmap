package ge.lanmaster.onmap.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author alexander
 */
public interface MyUserServiceAsync {
    void sayHello(AsyncCallback<String> callback);
}
