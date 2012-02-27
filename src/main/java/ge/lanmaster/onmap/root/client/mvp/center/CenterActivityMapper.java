package ge.lanmaster.onmap.root.client.mvp.center;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.place.AppClientPlace;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;

public class CenterActivityMapper implements ActivityMapper {

    private Activity currentActivity = null;
    private GinFactory injector;

    @Inject
    public CenterActivityMapper(GinFactory injector) {
        this.injector = injector;
    }

    public Activity getActivity(Place place) {
        if (place instanceof AppGuestPlace) {
            currentActivity = injector.getCenterActivityFactory().createCenterGuestActivity(((AppGuestPlace) place).getToken());
            return currentActivity;
        } else if (place instanceof AppClientPlace) {
            currentActivity = injector.getCenterActivityFactory().createCenterClientActivity(((AppClientPlace) place).getToken());
            return currentActivity;
        }
//        else if (place instanceof CenterGuestPlace) {
//            return new CenterGuestActivity(clientFactory, ((CenterGuestPlace) place).getToken());
//        } else
        return currentActivity;
    }
}

