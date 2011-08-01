package ge.lanmaster.onmap.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ge.lanmaster.onmap.client.MyUserService;

/**
 *
 * @author alexander
 */
public class MyUserServiceImpl extends RemoteServiceServlet implements MyUserService {

    public String sayHello() {
        return "sayHello() says hello! :)";
    }

}
