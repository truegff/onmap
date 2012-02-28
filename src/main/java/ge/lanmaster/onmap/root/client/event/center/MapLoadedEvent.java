package ge.lanmaster.onmap.root.client.event.center;

import com.google.gwt.event.shared.GwtEvent;

public class MapLoadedEvent extends GwtEvent<MapLoadedEventHandler> {
    public static Type<MapLoadedEventHandler> TYPE = new Type<MapLoadedEventHandler>();

    public Type<MapLoadedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(MapLoadedEventHandler handler) {
        handler.onMapLoaded(this);
    }
}
