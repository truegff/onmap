package ge.lanmaster.onmap.root.server.manager;

import com.google.inject.Inject;
import com.googlecode.objectify.Key;
import ge.lanmaster.onmap.root.client.entity.MapConfig;
import ge.lanmaster.onmap.root.client.entity.defaults.DefaultMapConfig;
import ge.lanmaster.onmap.root.server.DAO;
import ge.lanmaster.onmap.root.server.ServerFactory;

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
//        try {
        dao = new DAO<MapConfig>(MapConfig.class);
        config = dao.getOrCreate(factory.getUserService().getCurrentUser().getUserId());
        if (config.getId() == null) {
            config = new DefaultMapConfig();
            config.setId(factory.getUserService().getCurrentUser().getUserId());
        }
//        } catch (Exception e) {
//            Logger logger = Logger.getLogger("East side");
//            logger.log(Level.WARNING, "DAO creation exception");
//            config = new DefaultMapConfig();
//        }
        return config;
    }

    public Key<MapConfig> putMapConfig(MapConfig mapConfig) {

        DAO<MapConfig> dao;
        dao = new DAO<MapConfig>(MapConfig.class);
        Key<MapConfig> key = dao.put(mapConfig);

        return key;
    }
}
