package ge.lanmaster.onmap.root.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.googlecode.objectify.Key;
import ge.lanmaster.onmap.root.client.entity.MapConfig;

@RemoteServiceRelativePath("dts")
public interface DataTransferService extends RemoteService {
    public MapConfig getMapConfig();

    public Key<MapConfig> putMapConfig(MapConfig mapConfig);
}
