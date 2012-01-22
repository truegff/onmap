package ge.lanmaster.onmap.root.client.activity.north;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ui.north.NorthClientView;

public class NorthClientActivity extends AbstractActivity implements NorthClientView.Presenter{

    private ClientFactory clientFactory;
    private String name;

    public NorthClientActivity(ClientFactory clientFactory, String name) {
        this.name = name;
        this.clientFactory = clientFactory;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        NorthClientView northClientView = clientFactory.getNorthClientView();
        northClientView.setName(name);
        northClientView.setPresenter(this);
        containerWidget.setWidget(northClientView.asWidget());
    }

    public String mayStop() {
        return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }
}
