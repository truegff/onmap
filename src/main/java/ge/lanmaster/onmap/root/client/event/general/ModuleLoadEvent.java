package ge.lanmaster.onmap.root.client.event.general;

import com.google.gwt.event.shared.GwtEvent;

public class ModuleLoadEvent extends GwtEvent<ModuleLoadEventHandler> {
    public static Type<ModuleLoadEventHandler> TYPE = new Type<ModuleLoadEventHandler>();

    public Type<ModuleLoadEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ModuleLoadEventHandler handler) {
        handler.onModuleLoad(this);
    }
}
