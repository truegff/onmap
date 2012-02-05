package ge.lanmaster.onmap.root.client.activity.center;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ui.center.CenterClientView;

public class CenterClientActivity extends AbstractActivity implements CenterClientView.Presenter {

    private ClientFactory clientFactory;
    private String name;

    public CenterClientActivity(ClientFactory clientFactory, String name) {
        this.clientFactory = clientFactory;
        this.name = name;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        CenterClientView centerGuestView = clientFactory.getCenterClientView();
        centerGuestView.setName(name);
        centerGuestView.setPresenter(this);
        containerWidget.setWidget(centerGuestView.asWidget());
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }

    public String mayStop() {
        return null;
        //return "Please hold on. This activity is stopping.";
    }
}
