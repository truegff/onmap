package ge.lanmaster.onmap.root.client.activity.south;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ui.south.SouthNoneView;

public class SouthNoneActivity extends AbstractActivity implements SouthNoneView.Presenter{

    private ClientFactory clientFactory;
    private String name;

    public SouthNoneActivity(ClientFactory clientFactory, String name) {
        this.clientFactory = clientFactory;
        this.name = name;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        SouthNoneView southNoneView = clientFactory.getSouthNoneView();
        southNoneView.setName(name);
        southNoneView.setPresenter(this);
        containerWidget.setWidget(southNoneView.asWidget());
    }

    public String mayStop() {
        return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }
}
