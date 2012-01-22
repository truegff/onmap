package ge.lanmaster.onmap.root.client.ui.center;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface CenterMapView extends IsWidget {
    void setName(String name);
    void setPresenter(Presenter presenter);

    public interface Presenter {
        void goTo(Place place);
    }
}
