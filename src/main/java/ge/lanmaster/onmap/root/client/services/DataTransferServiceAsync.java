package ge.lanmaster.onmap.root.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.googlecode.objectify.Key;
import ge.lanmaster.onmap.root.client.entity.MapConfig;

public interface DataTransferServiceAsync {
    void getMapConfig(AsyncCallback<MapConfig> async);

    void putMapConfig(MapConfig mapConfig, AsyncCallback<Key<MapConfig>> async);
}
