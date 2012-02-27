package ge.lanmaster.onmap.root.client.activity.center;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.activity.MyAbstractActivity;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.ui.center.CenterGuestView;

public class CenterGuestActivity extends MyAbstractActivity implements CenterGuestView.Presenter {

    private GinFactory injector;
    private String name;

    @Inject
    public CenterGuestActivity(GinFactory injector, @Assisted String name) {
        this.injector = injector;
        this.name = name;
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        CenterGuestView centerGuestView = injector.getCenterGuestView();
        centerGuestView.setName(name);
        centerGuestView.setPresenter(this);
        containerWidget.setWidget(centerGuestView.asWidget());
    }

    public void goTo(Place place) {
        injector.getAppPlaceController().goTo(place);
    }

    public String mayStop() {
        return null;
        //return "Please hold on. This activity is stopping.";
    }
}
