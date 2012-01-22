package ge.lanmaster.onmap.root.client.ui.east;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface EastNoneView extends IsWidget{
    void setName(String name);
    void setPresenter(Presenter presenter);

    public interface Presenter {
        void goTo(Place place);
    }
}
