package ge.lanmaster.onmap.root.client.mvp.south;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;

public class SouthActivityMapper implements ActivityMapper {

    private Activity currentActivity;
    private GinFactory injector;

    @Inject
    public SouthActivityMapper(GinFactory injector) {
        this.injector = injector;
    }

    public Activity getActivity(Place place) {
        if (place instanceof AppGuestPlace) {
            currentActivity = injector.getSouthActivityFactory().createSouthGuestActivity(((AppGuestPlace) place).getToken());
            return currentActivity;
        }
//        else if (place instanceof SouthGuestPlace) {
//            return new SouthGuestActivity(clientFactory, ((SouthGuestPlace) place).getToken());
//        } else if (place instanceof SouthNonePlace) {
//            return new SouthNoneActivity(clientFactory, ((SouthNonePlace) place).getToken());
//        } else
        return currentActivity;
    }
}

