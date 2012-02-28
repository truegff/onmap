package ge.lanmaster.onmap.root.client.event.general;

import com.google.gwt.event.shared.GwtEvent;

public class UserStateRefreshSuccessEvent extends GwtEvent<UserStateRefreshSuccessEventHandler> {
    public static Type<UserStateRefreshSuccessEventHandler> TYPE = new Type<UserStateRefreshSuccessEventHandler>();

    public Type<UserStateRefreshSuccessEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(UserStateRefreshSuccessEventHandler handler) {
        handler.onUserStateRefreshSuccess(this);
    }
}
