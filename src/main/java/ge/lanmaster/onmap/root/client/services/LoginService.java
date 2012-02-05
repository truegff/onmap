package ge.lanmaster.onmap.root.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import ge.lanmaster.onmap.root.client.entity.UserState;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
    public UserState login(String requestUri);
}
