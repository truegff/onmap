package ge.lanmaster.onmap.root.client.activity.east;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ui.east.EastGuestView;

public class EastGuestActivity extends AbstractActivity implements EastGuestView.Presenter{

    private ClientFactory clientFactory;
    private String name;

    public EastGuestActivity(ClientFactory clientFactory, String name) {
        this.clientFactory = clientFactory;
        this.name = name;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        EastGuestView eastGuestView = clientFactory.getEastGuestView();
        eastGuestView.setName(name);
        eastGuestView.setPresenter(this);
        containerWidget.setWidget(eastGuestView.asWidget());
    }

    public String mayStop() {
        return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }
}
