package ge.lanmaster.onmap.root.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.activity.west.WestGuestActivity;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;

public class WestActivityMapper implements ActivityMapper {

    private Activity currentActivity;
    private ClientFactory clientFactory;

    public WestActivityMapper(ClientFactory clientFactory) {
        super();
        this.clientFactory = clientFactory;
    }

    public Activity getActivity(Place place) {
        if (place instanceof AppGuestPlace) {
            currentActivity = new WestGuestActivity(clientFactory, ((AppGuestPlace) place).getToken());
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

