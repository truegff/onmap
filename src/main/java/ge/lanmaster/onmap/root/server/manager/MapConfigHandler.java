package ge.lanmaster.onmap.root.server.manager;

import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.entity.MapConfig;
import ge.lanmaster.onmap.root.client.entity.defaults.DefaultMapConfig;
import ge.lanmaster.onmap.root.server.DAO;
import ge.lanmaster.onmap.root.server.ServerFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MapConfigHandler {

    private ServerFactory factory;

    @Inject
    public MapConfigHandler(ServerFactory factory) {
        this.factory = factory;
    }


    public MapConfig getMapConfig() {
        //function is called only when user is logged in
        DAO<MapConfig> dao;
        MapConfig config;
        try {
            dao = new DAO<MapConfig>(MapConfig.class);
            config = dao.getOrCreate(factory.getUserService().getCurrentUser().getUserId());
        } catch (Exception e) {
            Logger logger = Logger.getLogger("East side");
            logger.log(Level.WARNING, "DAO creation exception");
            config = new DefaultMapConfig();
        }
        return config;
    }

    public void putMapConfig(MapConfig mapConfig) {
        // not implemented yet
        throw new NotImplementedException();
    }
}
