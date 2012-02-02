package ge.lanmaster.onmap.root.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import ge.lanmaster.onmap.root.client.ui.center.CenterGuestView;
import ge.lanmaster.onmap.root.client.ui.center.CenterGuestViewImpl;
import ge.lanmaster.onmap.root.client.ui.east.EastGuestView;
import ge.lanmaster.onmap.root.client.ui.east.EastGuestViewImpl;
import ge.lanmaster.onmap.root.client.ui.north.NorthClientView;
import ge.lanmaster.onmap.root.client.ui.north.NorthClientViewImpl;
import ge.lanmaster.onmap.root.client.ui.north.NorthGuestView;
import ge.lanmaster.onmap.root.client.ui.north.NorthGuestViewImpl;
import ge.lanmaster.onmap.root.client.ui.south.SouthGuestView;
import ge.lanmaster.onmap.root.client.ui.south.SouthGuestViewImpl;
import ge.lanmaster.onmap.root.client.ui.west.WestGuestView;
import ge.lanmaster.onmap.root.client.ui.west.WestGuestViewImpl;

public class ClientFactoryImpl implements ClientFactory {

    //----------VARIABLE DECLARATIONS--------------//
    private final EventBus eventBus = new SimpleEventBus();
    private final PlaceController appPlaceController = new PlaceController(eventBus);
    private final CenterGuestView centerGuestView = new CenterGuestViewImpl();
    private final NorthGuestView northGuestView = new NorthGuestViewImpl();
    private final NorthClientView northClientView = new NorthClientViewImpl();
    private final SouthGuestView southGuestView = new SouthGuestViewImpl();
    private final WestGuestView westGuestView = new WestGuestViewImpl();
    private final EastGuestView eastGuestView = new EastGuestViewImpl();

    private UserStateManager userStateManager = new UserStateManager();

    //--------------EVENT BUSES--------------------//
    public EventBus getEventBus() {
        return eventBus;
    }

    //--------------PLACE CONTROLLER--------------//
    public PlaceController getAppPlaceController() {
        return appPlaceController;
    }

    //----------------CENTER VIEWS-----------------//
    public CenterGuestView getCenterGuestView() {
        return centerGuestView;
    }

    //----------------NORTH VIEWS-----------------//
    public NorthGuestView getNorthGuestView() {
        return northGuestView;
    }

    public NorthClientView getNorthClientView() {
        return northClientView;
    }

    //----------------SOUTH VIEWS-----------------//
    public SouthGuestView getSouthGuestView() {
        return southGuestView;
    }

    //----------------WEST VIEWS-----------------//
    public WestGuestView getWestGuestView() {
        return westGuestView;
    }

    //----------------EAST VIEWS-----------------//
    public EastGuestView getEastGuestView() {
        return eastGuestView;
    }

    public UserStateManager getUserStateManager() {
        return userStateManager;
    }

    public static class App {
        private static final ClientFactory ourInstance = GWT.create(ClientFactory.class);

        public static ClientFactory getInstance() {
            return ourInstance;
        }
    }
}
