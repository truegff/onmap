package ge.lanmaster.onmap.root.client.activity.north;

import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.activity.MyAbstractActivity;
import ge.lanmaster.onmap.root.client.ui.north.NorthGuestView;

public class NorthGuestActivity extends MyAbstractActivity implements NorthGuestView.Presenter{

    private ClientFactory clientFactory;
    private String name;

    public NorthGuestActivity(ClientFactory clientFactory, String name) {
        this.name = name;
        this.clientFactory = clientFactory;
        GWT.log(name);
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        NorthGuestView northGuestView = clientFactory.getNorthGuestView();
        northGuestView.setName(name);
        northGuestView.setPresenter(this);
        containerWidget.setWidget(northGuestView.asWidget());
    }

    public String mayStop() {
        return null;
        //return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }

    public ClientFactory getClientFactory() {
        return clientFactory;
    }
}
