package ge.lanmaster.onmap.root.client.event.center;

import com.google.gwt.event.shared.EventHandler;

public interface MapLoadedEventHandler extends EventHandler {
    void onMapLoaded(MapLoadedEvent event);
}
