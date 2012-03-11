package ge.lanmaster.onmap.root.client.event.center.menubar;

import com.google.gwt.event.shared.GwtEvent;

public class RestoreDefaultMapConfigEvent extends GwtEvent<RestoreDefaultMapConfigEventHandler> {
    public static Type<RestoreDefaultMapConfigEventHandler> TYPE = new Type<RestoreDefaultMapConfigEventHandler>();

    public Type<RestoreDefaultMapConfigEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(RestoreDefaultMapConfigEventHandler handler) {
        handler.onRestoreDefaultMapConfig(this);
    }
}
