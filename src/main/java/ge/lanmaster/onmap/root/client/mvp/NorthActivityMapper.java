package ge.lanmaster.onmap.root.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.activity.north.NorthGuestActivity;
import ge.lanmaster.onmap.root.client.activity.north.NorthClientActivity;
import ge.lanmaster.onmap.root.client.place.AppClientPlace;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;

public class NorthActivityMapper implements ActivityMapper {

    private Activity currentActivity = null;
    private ClientFactory clientFactory;

    public NorthActivityMapper(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    public Activity getActivity(Place place) {

        if (place instanceof AppGuestPlace) {
            currentActivity = new NorthGuestActivity(clientFactory, ((AppGuestPlace) place).getToken());
            return currentActivity;
        }
        if (place instanceof AppClientPlace) {
            currentActivity = new NorthClientActivity(clientFactory, ((AppClientPlace) place).getToken());
            return currentActivity;
        }

        return currentActivity;
    }
}