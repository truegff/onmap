package ge.lanmaster.onmap.root.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.manager.MapConfigManager;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;
import ge.lanmaster.onmap.root.client.ui.center.CenterClientView;
import ge.lanmaster.onmap.root.client.ui.center.CenterGuestView;
import ge.lanmaster.onmap.root.client.ui.east.EastGuestView;
import ge.lanmaster.onmap.root.client.ui.north.NorthClientView;
import ge.lanmaster.onmap.root.client.ui.north.NorthGuestView;
import ge.lanmaster.onmap.root.client.ui.south.SouthGuestView;
import ge.lanmaster.onmap.root.client.ui.west.WestGuestView;

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
     *
     * @return
     */
    PlaceController getAppPlaceController();

    CenterGuestView getCenterGuestView();

    CenterClientView getCenterClientView();

    NorthGuestView getNorthGuestView();

    NorthClientView getNorthClientView();

    SouthGuestView getSouthGuestView();

    WestGuestView getWestGuestView();

    EastGuestView getEastGuestView();

    UserStateManager getUserStateManager();

    MapConfigManager getMapConfigManager();
}
