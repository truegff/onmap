package ge.lanmaster.onmap.root.client.activity.east;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ui.east.EastBlankView;

public class EastBlankActivity extends AbstractActivity implements EastBlankView.Presenter{

    private ClientFactory clientFactory;
    private String name;

    public EastBlankActivity(ClientFactory clientFactory, String name) {
        this.clientFactory = clientFactory;
        this.name = name;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        EastBlankView eastBlankView = clientFactory.getEastBlankView();
        eastBlankView.setName(name);
        eastBlankView.setPresenter(this);
    }

    public String mayStop() {
        return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }
}
