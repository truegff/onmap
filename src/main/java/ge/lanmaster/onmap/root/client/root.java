package ge.lanmaster.onmap.root.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;
import ge.lanmaster.onmap.root.client.mvp.*;
import ge.lanmaster.onmap.root.client.place.AppClientPlace;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 *
 * @author Alexander Dolidze <alexander.dolidze@gmail.com>
 * @version 0.1-alpha
 */
public class root implements EntryPoint {
    /**
     * Main container in the app.
     *
     * @since 0.1-alpha
     */
    Place appDefaultPlace = null;
    private SplitLayoutPanel appWidget = new SplitLayoutPanel();

    /**
     * The first method that is run in the very beginning of the program lifecycle.
     *
     * @param clientFactory - ClientFactory instance
     */
    public void onModuleLoad_after_auth(ClientFactory clientFactory) {
        if (clientFactory.getUserStateManager().getUserState().isLoggedIn()) {
            appDefaultPlace = new AppClientPlace("");
        } else {
            appDefaultPlace = new AppGuestPlace("");
        }


        GWT.log("root --- onModuleLoad --- entering method");

//        /**
//         * Create ClientFactory using deferred binding, so we can replace with diffeerent
//         * implementations specified in gwt.xml.
//         *
//         * @since 0.1-alpha
//         * @see <link>http://code.google.com/webtoolkit/doc/latest/DevGuideMvpActivitiesAndPlaces.html</link>
//         */
        GWT.log("   creating clientFactory instance");

//        /**
//         * EventBus is needed to route events between different widgets.
//         * EventBus is one for all, used by all widgets in an application.
//         *
//         * @since 0.1-alpha
//         * @see <link>http://code.google.com/webtoolkit/doc/latest/DevGuideMvpActivitiesAndPlaces.html</link>
//         */
        GWT.log("       getting eventBus instance from clientfactory");
        EventBus eventBus = clientFactory.getEventBus();

//        /**
//         * PlaceController initiates navigation to a new Place and is responsible for warning the user before doing so.
//         *
//         * @since 0.1-alpha
//         * @see <link>http://code.google.com/webtoolkit/doc/latest/DevGuideMvpActivitiesAndPlaces.html</link>
//         */
        GWT.log("           getting ***PlaceController instances from clientFactory");
        PlaceController appPlaceController = clientFactory.getAppPlaceController();

//        /**
//         * The ActivityManager keeps track of all Activities running within the context of one container widget.
//         * It listens for PlaceChangeRequestEvents and notifies the current activity when a new Place has been
//         * requested. If the current Activity allows the Place change (Activity.onMayStop() returns null)
//         * or the user allows it (by clicking OK in the confirmation dialog), the ActivityManager discards
//         * the current Activity and starts the new one. In order to find the new one, it uses your app's
//         * ActivityMapper to obtain the Activity associated with the requested Place.
//         *
//         * Start ActivityManager from the main widget with our ActivityMapper.
//         *
//         * @since 0.1-alpha
//         * @see <link>http://code.google.com/webtoolkit/doc/latest/DevGuideMvpActivitiesAndPlaces.html</link>
//         */
        GWT.log("               instantiating ***ActivityMapper && ***ActivityManager");
        // for north
        ActivityMapper northActivityMapper = new NorthActivityMapper(clientFactory);
        ActivityManager northActivityManager = new ActivityManager(northActivityMapper, eventBus);
        // for west
        ActivityMapper westActivityMapper = new WestActivityMapper(clientFactory);
        ActivityManager westActivityManager = new ActivityManager(westActivityMapper, eventBus);
        // for center
        ActivityMapper centerActivityMapper = new CenterActivityMapper(clientFactory);
        ActivityManager centerActivityManager = new ActivityManager(centerActivityMapper, eventBus);
        // for east
        ActivityMapper eastActivityMapper = new EastActivityMapper(clientFactory);
        ActivityManager eastActivityManager = new ActivityManager(eastActivityMapper, eventBus);
        // for south
        ActivityMapper southActivityMapper = new SouthActivityMapper(clientFactory);
        ActivityManager southActivityManager = new ActivityManager(southActivityMapper, eventBus);

//        /**
//         * Not related to MVP stuff just containers.
//         */
        GWT.log("   instatiating NESWC container panels");
        SimplePanel south, north, east, west, center;
        south = new SimplePanel();
        north = new SimplePanel();
        east = new SimplePanel();
        west = new SimplePanel();
        center = new SimplePanel();

//        /**
//         * adding all containers to the main one
//         */
        GWT.log("       adding container panels to page body container (" + appWidget.getClass().toString() + ")");
        appWidget.addNorth(north, 200);
        appWidget.addSouth(south, 200);
        appWidget.addEast(east, 200);
        appWidget.addWest(west, 200);
        appWidget.add(center);

//        /**
//         * specifying their working areas to activity managers
//         */
        GWT.log("           specifying display panels for activityManagers");
        northActivityManager.setDisplay(north);
        westActivityManager.setDisplay(west);
        centerActivityManager.setDisplay(center);
        eastActivityManager.setDisplay(east);
        southActivityManager.setDisplay(south);

//        /**
//         * PlaceHistoryMapper is the link between your PlaceTokenizers and ...
//         *
//         * @see <link>http://code.google.com/webtoolkit/doc/latest/DevGuideMvpActivitiesAndPlaces.html</link>
//         */
        GWT.log("               instatiating placeHistoryMappers");
        AppPlaceHistoryMapper appPlaceHistoryMapper = GWT.create(AppPlaceHistoryMapper.class);

//        /**
//         * ... GWT's PlaceHistoryHandler that synchronizes the browser URL with each Place.
//         *
//         * PlaceHistoryHandler provides bi-directional mapping between Places and the URL.
//         * Whenever your app navigates to a new Place, the URL will be updated with the new token representing
//         * he Place so it can be bookmarked and saved in browser history. Likewise, when the user clicks
//         * the back button or pulls up a bookmark, PlaceHistoryHandler ensures that your application loads
//         * the corresponding Place.
//         *
//         * @see <link>http://code.google.com/webtoolkit/doc/latest/DevGuideMvpActivitiesAndPlaces.html</link>
//         */
        GWT.log("   instatiating plaecHistoryHandlers");
        PlaceHistoryHandler appHistoryHandler = new PlaceHistoryHandler(appPlaceHistoryMapper);

//        /**
//         * registering default place so if no specified within the token from url this one'll be loaded
//         */
        GWT.log("       registering default places for appropriate history handlers");
        appHistoryHandler.register(appPlaceController, eventBus, appDefaultPlace);

        //adding app's main container to the pages body
        GWT.log("           adding app's main container to the page's body");
        RootLayoutPanel.get().add(appWidget);

        GWT.log("               running historyHandlers' handleCurrentHistory method");
        appHistoryHandler.handleCurrentHistory();

        GWT.log("root --- onModuleLoad --- quitting method");
    }


    public void onModuleLoad() {
        final ClientFactory clientFactory = GWT.create(ClientFactory.class);
        UserStateManager usm = clientFactory.getUserStateManager();
        usm.refReshUserState(new Command() {
                    public void execute() {
                        //onFailure
                        onModuleLoad_auth_error(clientFactory);
                    }
                }, new Command() {
            public void execute() {
                //onSuccess
                onModuleLoad_after_auth(clientFactory);
            }
        }
        );
    }

    private void onModuleLoad_auth_error(ClientFactory clientFactory) {
        HTML message = new HTML("<div style=\"position:absolute; top:10px; left:10px;\">" +
                "გთხოვთ გვესტუმროთ მოგვიანებით." +
                "</div>");

        RootLayoutPanel.get().add(message);
    }
}





























