package ge.lanmaster.onmap.root.client.manager;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.googlecode.objectify.Key;
import ge.lanmaster.onmap.root.client.entity.MapConfig;
import ge.lanmaster.onmap.root.client.event.center.IMapConfigReadyMarker;
import ge.lanmaster.onmap.root.client.event.center.MapReadyEvent;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.services.DataTransferServiceAsync;

public class MapConfigManager {

    @Inject
    DataTransferServiceAsync dataTransferService;

    private MapConfig mapConfig;
    private GinFactory injector;

    @Inject
    public MapConfigManager(GinFactory injector) {
        this.injector = injector;
    }

    public void retrieveMapConfig() {
        dataTransferService.getMapConfig(
                new AsyncCallback<MapConfig>() {
                    public void onFailure(Throwable caught) {
                        //todo: think what to do in this case
                        //failureCase.execute();
                    }

                    public void onSuccess(MapConfig result) {
                        mapConfig = result;
                        injector.getEventBus().fireEvent(new MapReadyEvent(new IMapConfigReadyMarker() {
                        }));

                        //successCase.execute();
                    }
                }
        );
    }

    public MapConfig getMapConfig() {
        return mapConfig;
    }

    public void setMapConfig(MapConfig mapConfig) {
        this.mapConfig = mapConfig;
    }

    public void storeMapConfig() {
        dataTransferService.putMapConfig(
                mapConfig,
                new AsyncCallback<Key<MapConfig>>() {
                    public void onFailure(Throwable throwable) {
                        Window.alert("MapConfig store failure.");
                    }

                    public void onSuccess(Key<MapConfig> mapConfigKey) {
                        Window.alert("MapConfig store success.");
                    }
                }
        );
    }
}
