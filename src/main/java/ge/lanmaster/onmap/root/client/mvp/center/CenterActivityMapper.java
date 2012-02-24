package ge.lanmaster.onmap.root.client.mvp.center;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.activity.center.CenterClientActivity;
import ge.lanmaster.onmap.root.client.activity.center.CenterGuestActivity;
import ge.lanmaster.onmap.root.client.place.AppClientPlace;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;

public class CenterActivityMapper implements ActivityMapper {

    private Activity currentActivity = null;
    private ClientFactory clientFactory;

    @Inject
    public CenterActivityMapper(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    public Activity getActivity(Place place) {
        if (place instanceof AppGuestPlace) {
            currentActivity = new CenterGuestActivity(clientFactory, ((AppGuestPlace) place).getToken());
            return currentActivity;
        } else if (place instanceof AppClientPlace) {
            currentActivity = new CenterClientActivity(clientFactory, ((AppClientPlace) place).getToken());
            return currentActivity;
        }
//        else if (place instanceof CenterGuestPlace) {
//            return new CenterGuestActivity(clientFactory, ((CenterGuestPlace) place).getToken());
//        } else
        return currentActivity;
    }
}

