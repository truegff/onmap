package ge.lanmaster.onmap.root.server;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import ge.lanmaster.onmap.root.server.manager.MapConfigHandler;
import ge.lanmaster.onmap.root.server.manager.VisitorLogger;

public class ServerFactoryImpl implements ServerFactory {

    private UserService userService;
    private VisitorLogger visitorLogger;
    private MapConfigHandler mapConfigHandler;

    public ServerFactoryImpl() {
    }

    public UserService getUserService() {
        if (userService == null) userService = UserServiceFactory.getUserService();
        return userService;
    }

    public VisitorLogger getVisitorLogger() {
        if (visitorLogger == null) visitorLogger = new VisitorLogger();
        return visitorLogger;
    }

    public MapConfigHandler getMapConfigHandler() {
        if (mapConfigHandler == null) mapConfigHandler = new MapConfigHandler(this);
        return mapConfigHandler;
    }
}
