package ge.lanmaster.onmap.root.client.activity.west;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ui.west.WestNoneView;

public class WestNoneActivity extends AbstractActivity implements WestNoneView.Presenter{

    private ClientFactory clientFactory;
    private String name;

    public WestNoneActivity(ClientFactory clientFactory, String name) {
        this.clientFactory = clientFactory;
        this.name = name;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        WestNoneView westNoneView = clientFactory.getWestNoneView();
        westNoneView.setName(name);
        westNoneView.setPresenter(this);
        containerWidget.setWidget(westNoneView.asWidget());
    }

    public String mayStop() {
        return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }
}
