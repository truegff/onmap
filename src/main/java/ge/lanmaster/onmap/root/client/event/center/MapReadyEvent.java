package ge.lanmaster.onmap.root.client.event.center;

import com.google.gwt.event.shared.GwtEvent;

public class MapReadyEvent extends GwtEvent<IMapReadyEventHandler> {
    public static Type<IMapReadyEventHandler> TYPE = new Type<IMapReadyEventHandler>();
    private static Boolean mapConfigPreloaded = false;
    private static Boolean mapWidgetPreloaded = false;

    public MapReadyEvent(IMapConfigReadyMarker obj) {
        if (obj != null)
            mapConfigPreloaded = true;
    }

    public MapReadyEvent(IMapPreloadFinishedMarker obj) {
        if (obj != null)
            mapWidgetPreloaded = true;
    }

    public Type<IMapReadyEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IMapReadyEventHandler handler) {
        handler.onMapReady(this);
    }

    public static Boolean getMapConfigPreloaded() {
        return mapConfigPreloaded;
    }

    public static Boolean getMapWidgetPreloaded() {
        return mapWidgetPreloaded;
    }
}

