package ge.lanmaster.onmap.root.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.activity.east.EastGuestActivity;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;

public class EastActivityMapper implements ActivityMapper {

    private Activity currentActivity = null;
    private ClientFactory clientFactory;

    public EastActivityMapper(ClientFactory clientFactory) {
        super();
        this.clientFactory = clientFactory;
    }

    public Activity getActivity(Place place) {
        if (place instanceof AppGuestPlace) {
            currentActivity = new EastGuestActivity(clientFactory, ((AppGuestPlace) place).getToken());
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

