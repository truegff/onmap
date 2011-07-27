package ge.lanmaster.onmap.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author alexander
 */
@RemoteServiceRelativePath("userService")
public interface MyUserService extends RemoteService {
    String sayHello();
}
