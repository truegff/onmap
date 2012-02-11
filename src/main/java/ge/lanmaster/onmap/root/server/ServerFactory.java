package ge.lanmaster.onmap.root.server;

import com.google.appengine.api.users.UserService;
import ge.lanmaster.onmap.root.server.manager.VisitorLogger;

public interface ServerFactory {
    public UserService getUserService();

    public VisitorLogger getVisitorLogger();
}
