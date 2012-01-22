package ge.lanmaster.onmap.root.client.activity.center;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ui.center.CenterBlankView;

public class CenterBlankActivity extends AbstractActivity implements CenterBlankView.Presenter {

    private ClientFactory clientFactory;
    private String name;


    public CenterBlankActivity(ClientFactory clientFactory, String name) {
        this.clientFactory = clientFactory;
        this.name = name;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        CenterBlankView centerBlankView = clientFactory.getCenterBlankView();
        centerBlankView.setName(name);
        centerBlankView.setPresenter(this);
        containerWidget.setWidget(centerBlankView.asWidget());
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }

    public String mayStop() {
        return "Please hold on. This activity is stopping.";
    }
}
