package ge.lanmaster.onmap.root.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.inject.Inject;

public class AppPlaceHistoryHandler extends PlaceHistoryHandler {
    @Inject
    public AppPlaceHistoryHandler(AppPlaceHistoryMapper mapper) {
        super(mapper);
    }
}
