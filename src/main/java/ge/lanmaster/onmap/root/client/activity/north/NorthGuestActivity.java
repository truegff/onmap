package ge.lanmaster.onmap.root.client.activity.north;

import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.activity.MyAbstractActivity;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;
import ge.lanmaster.onmap.root.client.ui.north.NorthGuestView;

public class NorthGuestActivity extends MyAbstractActivity implements NorthGuestView.Presenter{

    private GinFactory injector;
    private String name;

    @Inject
    public NorthGuestActivity(GinFactory injector, @Assisted String name) {
        this.name = name;
        this.injector = injector;
        GWT.log(name);
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        NorthGuestView northGuestView = injector.getNorthGuestView();
        northGuestView.setName(name);
        northGuestView.setPresenter(this);
        containerWidget.setWidget(northGuestView.asWidget());
    }

    public String mayStop() {
        return null;
        //return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        injector.getAppPlaceController().goTo(place);
    }

    public UserStateManager getUserStateManager() {
        return injector.getUserStateManager();
    }
}
