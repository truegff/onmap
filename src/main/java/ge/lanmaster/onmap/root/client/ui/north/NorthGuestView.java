package ge.lanmaster.onmap.root.client.ui.north;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;

public interface NorthGuestView extends IsWidget{
    void setName(String name);
    void setPresenter(Presenter presenter);

    public interface Presenter {
        void goTo(Place place);
        UserStateManager getUserStateManager();
    }
}
