package ge.lanmaster.onmap.root.client.mvp.north;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.activity.north.NorthGuestActivity;
import ge.lanmaster.onmap.root.client.activity.north.NorthClientActivity;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.place.AppClientPlace;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;

public class NorthActivityMapper implements ActivityMapper {

    private Activity currentActivity = null;
    private GinFactory injector;

    @Inject
    public NorthActivityMapper(GinFactory injector) {
        this.injector = injector;
    }

    public Activity getActivity(Place place) {

        if (place instanceof AppGuestPlace) {
            currentActivity = injector.getNorthGuestActivityFactory().create(((AppGuestPlace) place).getToken());
            return currentActivity;
        }
        if (place instanceof AppClientPlace) {
            currentActivity = injector.getNorthClientActivityFactory().create(((AppClientPlace) place).getToken());
            return currentActivity;
        }

        return currentActivity;
    }
}