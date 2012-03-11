package ge.lanmaster.onmap.root.client.event.center.menubar;

import com.google.gwt.event.shared.GwtEvent;

public class SaveCurrentMapConfigEvent extends GwtEvent<SaveCurrentMapConfigEventHandler> {
    public static Type<SaveCurrentMapConfigEventHandler> TYPE = new Type<SaveCurrentMapConfigEventHandler>();

    public Type<SaveCurrentMapConfigEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(SaveCurrentMapConfigEventHandler handler) {
        handler.onSaveCurrentMapConfig(this);
    }
}
