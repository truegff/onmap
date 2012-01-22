package ge.lanmaster.onmap.root.client.activity.north;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ui.north.NorthBlankView;

public class NorthBlankActivity extends AbstractActivity implements NorthBlankView.Presenter{

    private ClientFactory clientFactory;
    private String name;

    public NorthBlankActivity(ClientFactory clientFactory, String name) {
        this.clientFactory = clientFactory;
        this.name = name;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        NorthBlankView northBlankView = clientFactory.getNorthBlankView();
        northBlankView.setName(name);
        northBlankView.setPresenter(this);
        containerWidget.setWidget(northBlankView.asWidget());
    }

    public String mayStop(){
        return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }
}
