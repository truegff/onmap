package ge.lanmaster.onmap.root.client.activity.west;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ui.west.WestGuestView;

public class WestGuestActivity extends AbstractActivity implements WestGuestView.Presenter{

    private ClientFactory clientFactory;
    private String name;

    public WestGuestActivity(ClientFactory clientFactory, String name) {
        this.clientFactory = clientFactory;
        this.name = name;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        WestGuestView westGuestView = clientFactory.getWestGuestView();
        westGuestView.setName(name);
        westGuestView.setPresenter(this);
        containerWidget.setWidget(westGuestView.asWidget());
    }

    public String mayStop() {
        return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }
}
