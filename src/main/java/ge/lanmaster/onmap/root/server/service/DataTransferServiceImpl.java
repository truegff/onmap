package ge.lanmaster.onmap.root.server.service;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.inject.Inject;
import com.googlecode.objectify.Key;
import ge.lanmaster.onmap.root.client.entity.MapConfig;
import ge.lanmaster.onmap.root.client.entity.defaults.DefaultMapConfig;
import ge.lanmaster.onmap.root.client.services.DataTransferService;
import ge.lanmaster.onmap.root.server.ServerFactory;
import ge.lanmaster.onmap.root.server.manager.MapConfigHandler;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DataTransferServiceImpl extends RemoteServiceServlet implements DataTransferService {

    private ServerFactory factory;

    @Inject
    public DataTransferServiceImpl(ServerFactory factory) {
        this.factory = factory;
    }

    public MapConfig getMapConfig() {
        MapConfig mapConfig = null;
        Boolean userLoggedIn = false;
        userLoggedIn = factory.getUserService().isUserLoggedIn();

        if (userLoggedIn) {
            MapConfigHandler mapConfigHandler = factory.getMapConfigHandler();
            mapConfig = mapConfigHandler.getMapConfig();
        } else {
            mapConfig = new DefaultMapConfig();
        }

        return mapConfig;
    }

    public Key<MapConfig> putMapConfig(MapConfig mapConfig) {
        Boolean userLoggedIn = false;
        userLoggedIn = factory.getUserService().isUserLoggedIn();
        Key<MapConfig> key = null;

        if (userLoggedIn) {
            if (mapConfig.getId().equalsIgnoreCase(factory.getUserService().getCurrentUser().getEmail())) {
                MapConfigHandler mapConfigHandler = factory.getMapConfigHandler();
                key = mapConfigHandler.putMapConfig(mapConfig);
            } else {
                Logger logger = Logger.getLogger("IllegalOperationAttemptLog");
                logger.log(Level.WARNING, "User '" + factory.getUserService().getCurrentUser().getEmail() + "' tried to write" +
                        " MapConfig object, that doesn't belong to him.");
            }
        }

        return key;
    }
}
