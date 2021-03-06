package ge.lanmaster.onmap.root.client.activity.east;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.activity.MyAbstractActivity;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.ui.east.EastGuestView;

public class EastGuestActivity extends MyAbstractActivity implements EastGuestView.Presenter {

    private GinFactory injector;
    private String name;

    @Inject
    public EastGuestActivity(GinFactory injector, @Assisted String name) {
        this.injector = injector;
        this.name = name;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        EastGuestView eastGuestView = injector.getEastGuestView();
        eastGuestView.setName(name);
        eastGuestView.setPresenter(this);
        containerWidget.setWidget(eastGuestView.asWidget());
    }

    public String mayStop() {
        return null;
        //return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        injector.getAppPlaceController().goTo(place);
    }
}
