package ge.lanmaster.onmap.root.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import ge.lanmaster.onmap.root.client.ui.center.*;
import ge.lanmaster.onmap.root.client.ui.east.*;
import ge.lanmaster.onmap.root.client.ui.north.*;
import ge.lanmaster.onmap.root.client.ui.south.*;
import ge.lanmaster.onmap.root.client.ui.west.*;

public class ClientFactoryImpl implements ClientFactory{

    //----------VARIABLE DECLARATIONS--------------//
    private final EventBus eventBus = new SimpleEventBus();
    private final PlaceController appPlaceController = new PlaceController(eventBus);
//    private final PlaceController westPlaceController = new PlaceController(eventBus);
//    private final PlaceController centerPlaceController = new PlaceController(eventBus);
//    private final PlaceController eastPlaceController = new PlaceController(eventBus);
//    private final PlaceController southPlaceController = new PlaceController(eventBus);


    private final CenterBlankView centerBlankView = new CenterBlankViewImpl();
    private final CenterGuestView centerGuestView = new CenterGuestViewImpl();

    private final NorthNoneView northNoneView = new NorthNoneViewImpl();
    private final NorthGuestView northGuestView = new NorthGuestViewImpl();
    private final NorthBlankView northBlankview = new NorthBlankViewImpl();
    private final NorthClientView northClientView = new NorthClientViewImpl();

    private final SouthNoneView southNoneView = new SouthNoneViewImpl();
    private final SouthGuestView southGuestView = new SouthGuestViewImpl();
    private final SouthBlankView southBlankView = new SouthBlankViewImpl();

    private final WestNoneView westNoneView = new WestNoneViewImpl();
    private final WestBlankView westBlankView = new WestBlankViewImpl();
    private final WestGuestView westGuestView = new WestGuestViewImpl();

    private final EastNoneView eastNoneView = new EastNoneViewImpl();
    private final EastGuestView eastGuestView = new EastGuestViewImpl();
    private final EastBlankView eastBlankView = new EastBlankViewImpl();
    private LoginInfoManager loginInfoManager;

//    private final HelloView helloView = new HelloViewImpl();
//    private final GoodbyeView goodbyeView = new GoodbyeViewImpl();


    //--------------EVENT BUSES--------------------//
    public EventBus getEventBus() {
        return eventBus;
    }

    //--------------PLACE CONTROLLERS--------------//
    public PlaceController getAppPlaceController() {
        return appPlaceController;
    }

//    public PlaceController getWestPlaceController() {
//        return westPlaceController;
//    }
//
//    public PlaceController getCenterPlaceController() {
//        return centerPlaceController;
//    }
//
//    public PlaceController getEastPlaceController() {
//        return eastPlaceController;
//    }
//
//    public PlaceController getSouthPlaceController() {
//        return southPlaceController;
//    }

    //----------------CENTER VIEWS-----------------//
    public CenterBlankView getCenterBlankView() {
        return centerBlankView;
    }

    public CenterGuestView getCenterGuestView() {
        return centerGuestView;
    }

    //----------------NORTH VIEWS-----------------//
    public NorthNoneView getNorthNoneView() {
        return northNoneView;
    }

    public NorthBlankView getNorthBlankView() {
        return northBlankview;
    }

    public NorthGuestView getNorthGuestView() {
        return northGuestView;
    }

    public NorthClientView getNorthClientView() {
        return northClientView;
    }

    //----------------SOUTH VIEWS-----------------//
    public SouthNoneView getSouthNoneView() {
        return southNoneView;
    }

    public SouthGuestView getSouthGuestView() {
        return southGuestView;
    }

    public SouthBlankView getSouthBlankView() {
        return southBlankView;
    }

    //----------------WEST VIEWS-----------------//
    public WestNoneView getWestNoneView() {
        return westNoneView;
    }

    public WestBlankView getWestBlankView() {
        return westBlankView;
    }

    public WestGuestView getWestGuestView() {
        return westGuestView;
    }

    //----------------EAST VIEWS-----------------//
    public EastNoneView getEastNoneView() {
        return eastNoneView;
    }

    public EastBlankView getEastBlankView() {
        return eastBlankView;
    }

    public EastGuestView getEastGuestView() {
        return eastGuestView;
    }

//    public HelloView getHelloView() {
//        return helloView;
//    }
//
//    public GoodbyeView getGoodbyeView() {
//        return goodbyeView;
//    }


    public LoginInfoManager getLoginInfoManager() {
        return loginInfoManager;
    }


    public static class App {
        private static final ClientFactory ourInstance = GWT.create(ClientFactory.class);

        public static ClientFactory getInstance() {
            return ourInstance;
        }
    }
}
