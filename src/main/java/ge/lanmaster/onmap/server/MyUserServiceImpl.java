/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.lanmaster.onmap.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ge.lanmaster.onmap.client.MyUserService;
import ge.lanmaster.onmap.client.MyUserServiceAsync;

/**
 *
 * @author alexander
 */
public class MyUserServiceImpl extends RemoteServiceServlet implements MyUserService {

    public String sayHello() {
        return "sayHello() says hello! :)";

    }

}
