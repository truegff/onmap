package ge.lanmaster.onmap.root.client.activity.south;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.activity.MyAbstractActivity;
import ge.lanmaster.onmap.root.client.ui.south.SouthGuestView;

public class SouthGuestActivity extends MyAbstractActivity implements SouthGuestView.Presenter{

    private ClientFactory clientFactory;
    private String name;

    public SouthGuestActivity(ClientFactory clientFactory, String name) {
        this.clientFactory = clientFactory;
        this.name = name;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        SouthGuestView southGuestView = clientFactory.getSouthGuestView();
        southGuestView.setName(name);
        southGuestView.setPresenter(this);
        containerWidget.setWidget(southGuestView.asWidget());
    }

    public String mayStop(){
        return null;
        //return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }
}
