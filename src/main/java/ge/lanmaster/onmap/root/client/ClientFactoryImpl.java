package ge.lanmaster.onmap.root.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import ge.lanmaster.onmap.root.client.manager.MapConfigManager;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;
import ge.lanmaster.onmap.root.client.ui.center.CenterClientView;
import ge.lanmaster.onmap.root.client.ui.center.CenterClientViewImpl;
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

    private CenterGuestView centerGuestView;
    private CenterClientView centerClientView;
    private NorthGuestView northGuestView;
    private NorthClientView northClientView;
    private SouthGuestView southGuestView;
    private WestGuestView westGuestView;
    private EastGuestView eastGuestView;

    private UserStateManager userStateManager;
    private MapConfigManager mapConfigManager;

    //--------------EVENT BUS----------------------//
    public EventBus getEventBus() {
        return eventBus;
    }

    //--------------PLACE CONTROLLER--------------//
    public PlaceController getAppPlaceController() {
        return appPlaceController;
    }

    //----------------CENTER VIEWS-----------------//
    public CenterGuestView getCenterGuestView() {
        if (centerGuestView == null)
            centerGuestView = new CenterGuestViewImpl();
        return centerGuestView;
    }

    public CenterClientView getCenterClientView() {
        if (centerClientView == null)
            centerClientView = new CenterClientViewImpl();
        return centerClientView;
    }

    //----------------NORTH VIEWS-----------------//
    public NorthGuestView getNorthGuestView() {
        if (northGuestView == null)
            northGuestView = new NorthGuestViewImpl();
        return northGuestView;
    }

    public NorthClientView getNorthClientView() {
        if (northClientView == null)
            northClientView = new NorthClientViewImpl();
        return northClientView;
    }

    //----------------SOUTH VIEWS-----------------//
    public SouthGuestView getSouthGuestView() {
        if (southGuestView == null)
            southGuestView = new SouthGuestViewImpl();
        return southGuestView;
    }

    //----------------WEST VIEWS-----------------//
    public WestGuestView getWestGuestView() {
        if (westGuestView == null)
            westGuestView = new WestGuestViewImpl();
        return westGuestView;
    }

    //----------------EAST VIEWS-----------------//
    public EastGuestView getEastGuestView() {
        if (eastGuestView == null)
            eastGuestView = new EastGuestViewImpl();
        return eastGuestView;
    }

    //----------------MANAGERS------------------//
    public UserStateManager getUserStateManager() {
        if (userStateManager == null)
            userStateManager = new UserStateManager();
        return userStateManager;
    }

    public MapConfigManager getMapConfigManager() {
        if (mapConfigManager == null)
            mapConfigManager = new MapConfigManager();
        return mapConfigManager;
    }

}
