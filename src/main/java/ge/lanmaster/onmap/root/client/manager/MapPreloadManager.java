package ge.lanmaster.onmap.root.client.manager;

import com.google.gwt.maps.client.Maps;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.event.center.IMapPreloadFinishedMarker;
import ge.lanmaster.onmap.root.client.event.center.MapReadyEvent;
import ge.lanmaster.onmap.root.client.gin.GinFactory;

public class MapPreloadManager {

    private GinFactory injector;

    @Inject
    public MapPreloadManager(GinFactory injector) {
        this.injector = injector;
    }

    public void doPreload() {
        Maps.loadMapsApi("", "2", false, new Runnable() {
            public void run() {
                injector.getEventBus().fireEvent(
                        new MapReadyEvent(
                                new IMapPreloadFinishedMarker() {
                                }
                        )
                );
            }
        });
    }
}
