package ge.lanmaster.onmap.root.client.event.center;

import com.google.gwt.event.shared.EventHandler;

public interface IMapReadyEventHandler extends EventHandler {
    void onMapReady(MapReadyEvent event);
}
