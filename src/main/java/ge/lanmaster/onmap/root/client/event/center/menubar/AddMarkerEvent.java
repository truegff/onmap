package ge.lanmaster.onmap.root.client.event.center.menubar;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.maps.client.geom.LatLng;

public class AddMarkerEvent extends GwtEvent<AddMarkerEventHandler> {
    public static Type<AddMarkerEventHandler> TYPE = new Type<AddMarkerEventHandler>();

    private LatLng position;

    public AddMarkerEvent(LatLng position) {
        this.position = position;
    }

    public LatLng getPosition() {
        return position;
    }

    public Type<AddMarkerEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(AddMarkerEventHandler handler) {
        handler.onAddMarker(this);
    }
}
