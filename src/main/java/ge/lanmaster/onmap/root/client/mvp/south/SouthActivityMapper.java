package ge.lanmaster.onmap.root.client.mvp.south;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.activity.south.SouthGuestActivity;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;

public class SouthActivityMapper implements ActivityMapper {

    private Activity currentActivity;
    private ClientFactory clientFactory;

    @Inject
    public SouthActivityMapper(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    public Activity getActivity(Place place) {
        if (place instanceof AppGuestPlace) {
            currentActivity = new SouthGuestActivity(clientFactory, ((AppGuestPlace) place).getToken());
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

