package ge.lanmaster.onmap.root.client.activity.south;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ui.south.SouthGuestView;

public class SouthGuestActivity extends AbstractActivity implements SouthGuestView.Presenter{

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
        return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }
}
