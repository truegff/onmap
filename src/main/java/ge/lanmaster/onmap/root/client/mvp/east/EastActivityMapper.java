package ge.lanmaster.onmap.root.client.mvp.east;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;

public class EastActivityMapper implements ActivityMapper {

    private Activity currentActivity = null;
    private GinFactory injector;

    @Inject
    public EastActivityMapper(GinFactory injector) {
        this.injector = injector;
    }

    public Activity getActivity(Place place) {
        if (place instanceof AppGuestPlace) {
            currentActivity = injector.getEastActivityFactory().createEastGuestActivity(((AppGuestPlace) place).getToken());
            return currentActivity;
        }
//        else if (place instanceof EastGuestPlace)  {
//            return new EastGuestActivity(clientFactory, ((EastGuestPlace) place).getToken());
//        } else if (place instanceof EastNonePlace) {
//            return new EastNoneActivity(clientFactory, ((EastNonePlace) place).getToken());
//        }
        return currentActivity;
    }
}

