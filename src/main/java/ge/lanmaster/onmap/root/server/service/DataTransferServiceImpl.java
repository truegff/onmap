package ge.lanmaster.onmap.root.server.service;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.entity.MapConfig;
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
        if (factory.getUserService().isUserLoggedIn()) {
            //try to get users mapconfig
        } else {
            //assign default one
        }
        return mapConfig;
    }
}
