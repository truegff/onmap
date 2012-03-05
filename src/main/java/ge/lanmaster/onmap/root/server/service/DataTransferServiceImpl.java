package ge.lanmaster.onmap.root.server.service;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.entity.MapConfig;
import ge.lanmaster.onmap.root.client.entity.defaults.DefaultMapConfig;
import ge.lanmaster.onmap.root.client.services.DataTransferService;
import ge.lanmaster.onmap.root.server.ServerFactory;

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
//
//        if (userLoggedIn) {
//            MapConfigHandler mapConfigHandler = factory.getMapConfigHandler();
//            mapConfigHandler.getMapConfig();
//            //try to get users mapconfig
//        } else {
//            //assign default one
//            mapConfig = new DefaultMapConfig();
//        }
        mapConfig = new DefaultMapConfig();
        return mapConfig;
    }
}
