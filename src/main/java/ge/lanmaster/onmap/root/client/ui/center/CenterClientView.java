package ge.lanmaster.onmap.root.client.ui.center;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public interface CenterClientView extends IsWidget {
    void setName(String name);

    void setPresenter(Presenter presenter);

    void addWidget(Widget widget);

    public interface Presenter {
        void goTo(Place place);
    }
}
