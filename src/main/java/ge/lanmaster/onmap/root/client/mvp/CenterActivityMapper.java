package ge.lanmaster.onmap.root.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.activity.center.CenterBlankActivity;
import ge.lanmaster.onmap.root.client.activity.center.CenterGuestActivity;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;
import ge.lanmaster.onmap.root.client.place.center.CenterBlankPlace;
import ge.lanmaster.onmap.root.client.place.center.CenterGuestPlace;

public class CenterActivityMapper implements ActivityMapper{

    private Activity currentActivity = null;
    private ClientFactory clientFactory;

    public CenterActivityMapper(ClientFactory clientFactory) {
        super();
        this.clientFactory = clientFactory;
    }

    public Activity getActivity(Place place) {
        if (place instanceof AppGuestPlace) {
            currentActivity = new CenterGuestActivity(clientFactory, ((AppGuestPlace) place).getToken());
            return currentActivity;
        }
//        else if (place instanceof CenterGuestPlace) {
//            return new CenterGuestActivity(clientFactory, ((CenterGuestPlace) place).getToken());
//        } else
        return currentActivity;
    }
}

