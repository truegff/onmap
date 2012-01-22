package ge.lanmaster.onmap.root.client.activity.west;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.place.west.WestBlankPlace;
import ge.lanmaster.onmap.root.client.ui.west.WestBlankView;

public class WestBlankActivity extends AbstractActivity implements WestBlankView.Presenter {

    private ClientFactory clientFactory;
    private String name;

    public WestBlankActivity( ClientFactory clientFactory, String name) {
        this.name = name;
        this.clientFactory = clientFactory;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus){
        WestBlankView westBlankView = clientFactory.getWestBlankView();
        westBlankView.setName(name);
        westBlankView.setPresenter(this);
        containerWidget.setWidget(westBlankView.asWidget());
    }

    public String mayStop() {
        return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }
}
