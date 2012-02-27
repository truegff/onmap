package ge.lanmaster.onmap.root.client.mvp.west;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;

public class WestActivityMapper implements ActivityMapper {

    private Activity currentActivity;
    private GinFactory injector;

    @Inject
    public WestActivityMapper(GinFactory injector) {
        this.injector = injector;
    }

    public Activity getActivity(Place place) {
        if (place instanceof AppGuestPlace) {
            currentActivity = injector.getWestActivityFactory().createWestGuestActivity(((AppGuestPlace) place).getToken());
            return currentActivity;
        }
//        else if (place instanceof WestGuestPlace) {
//            return new WestGuestActivity(clientFactory, ((WestGuestPlace) place).getToken());
//        } else if (place instanceof WestNonePlace) {
//            return new WestNoneActivity(clientFactory, ((WestNonePlace) place).getToken());
//        } else
        return currentActivity;
    }
}

