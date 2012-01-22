package ge.lanmaster.onmap.root.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import ge.lanmaster.onmap.root.client.ui.center.*;
import ge.lanmaster.onmap.root.client.ui.east.*;
import ge.lanmaster.onmap.root.client.ui.north.*;
import ge.lanmaster.onmap.root.client.ui.south.*;
import ge.lanmaster.onmap.root.client.ui.west.*;
/**
 * Client factory interface.
 *
 * @author Alexander Dolidze <alexander.dolidze@gmail.com>
 * @version 0.1-alpha
 */
public interface ClientFactory {
    /**
     * EventBus singleton instance getter.
     *
     * @return EventBus
     */
    EventBus getEventBus();

    /**
     * PlaceController
     * @return
     */
    PlaceController getAppPlaceController();
//    PlaceController getWestPlaceController();
//    PlaceController getCenterPlaceController();
//    PlaceController getEastPlaceController();
//    PlaceController getSouthPlaceController();

//    HelloView getHelloView();
//    GoodbyeView getGoodbyeView();

    CenterBlankView getCenterBlankView();
    CenterGuestView getCenterGuestView();

    NorthNoneView getNorthNoneView();
    NorthBlankView getNorthBlankView();
    NorthGuestView getNorthGuestView();
    NorthClientView getNorthClientView();

    SouthNoneView getSouthNoneView();
    SouthGuestView getSouthGuestView();
    SouthBlankView getSouthBlankView();

    WestNoneView getWestNoneView();
    WestBlankView getWestBlankView();
    WestGuestView getWestGuestView();

    EastNoneView getEastNoneView();
    EastBlankView getEastBlankView();
    EastGuestView getEastGuestView();

    LoginInfoManager getLoginInfoManager();
}
