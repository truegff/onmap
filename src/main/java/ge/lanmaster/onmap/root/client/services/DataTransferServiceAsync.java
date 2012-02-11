package ge.lanmaster.onmap.root.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import ge.lanmaster.onmap.root.client.entity.MapConfig;

public interface DataTransferServiceAsync {
    void getMapConfig(AsyncCallback<MapConfig> async);
}
