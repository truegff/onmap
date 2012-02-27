package ge.lanmaster.onmap.root.client.activity.north;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.activity.MyAbstractActivity;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;
import ge.lanmaster.onmap.root.client.ui.north.NorthClientView;

public class NorthClientActivity extends MyAbstractActivity implements NorthClientView.Presenter {

    private GinFactory injector;
    private String name;

    @Inject
    public NorthClientActivity(GinFactory injector, @Assisted String name) {
        this.name = name;
        this.injector = injector;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        NorthClientView northClientView = injector.getNorthClientView();
        northClientView.setName(name);
        northClientView.setPresenter(this);
        containerWidget.setWidget(northClientView.asWidget());
    }

    public String mayStop() {
        return null;
    }

    public void goTo(Place place) {
        injector.getAppPlaceController().goTo(place);
    }

    public UserStateManager getUserStateManager() {
        return injector.getUserStateManager();
    }
}
