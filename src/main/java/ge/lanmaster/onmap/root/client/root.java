package ge.lanmaster.onmap.root.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;
import ge.lanmaster.onmap.root.client.place.AppClientPlace;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 *
 * @author Alexander Dolidze <alexander.dolidze@gmail.com>
 * @version 0.1-alpha
 */
public class root implements EntryPoint {
    private final GinFactory injector = GWT.create(GinFactory.class);

    private SplitLayoutPanel appWidget = new SplitLayoutPanel();

    Place appDefaultPlace = null;

    public void onModuleLoad() {
        UserStateManager usm = injector.getUserStateManager();

        usm.refReshUserState(
            new Command() {
                public void execute() {
                    //onFailure
                    onModuleLoad_auth_error();
                }
            },
            new Command() {
                public void execute() {
                    //onSuccess
                    onModuleLoad_after_auth();
                }
            }
        );
    }


    public void onModuleLoad_after_auth() {
        if (injector.getUserStateManager().getUserState().isLoggedIn()) {
            appDefaultPlace = new AppClientPlace("");
        } else {
            appDefaultPlace = new AppGuestPlace("");
        }

        GWT.log("root --- onModuleLoad --- entering method");

        EventBus eventBus = injector.getClientFactory().getEventBus();

        PlaceController appPlaceController = injector.getClientFactory().getAppPlaceController();

        ActivityManager northActivityManager = injector.getNorthActivityManagerFactory().create(eventBus);
        ActivityManager westActivityManager = injector.getWestActivityManagerFactory().create(eventBus);
        ActivityManager centerActivityManager = injector.getCenterActivityManagerFactory().create(eventBus);
        ActivityManager eastActivityManager = injector.getEastActivityManagerFactory().create(eventBus);
        ActivityManager southActivityManager = injector.getSouthActivityManagerFactory().create(eventBus);

        /**
         * adding all containers to the main one
         */
        GWT.log("       adding container panels to page body container (" + appWidget.getClass().toString() + ")");
        appWidget.addNorth(injector.getNorthPanel(), 200);
        appWidget.addSouth(injector.getSouthPanel(), 200);
        appWidget.addEast(injector.getEastPanel(), 200);
        appWidget.addWest(injector.getWestPanel(), 200);
        appWidget.add(injector.getCenterPanel());

        /**
         * specifying their working areas to activity managers
         */
        GWT.log("           specifying display panels for activityManagers");
        northActivityManager.setDisplay(injector.getNorthPanel());
        westActivityManager.setDisplay(injector.getWestPanel());
        centerActivityManager.setDisplay(injector.getCenterPanel());
        eastActivityManager.setDisplay(injector.getEastPanel());
        southActivityManager.setDisplay(injector.getSouthPanel());

        injector.getAppPlaceHistoryHandler().register(appPlaceController, eventBus, appDefaultPlace);
        injector.getAppPlaceHistoryHandler().handleCurrentHistory();
        RootLayoutPanel.get().add(appWidget);

        GWT.log("root --- onModuleLoad --- quitting method");
    }


    private void onModuleLoad_auth_error() {
        HTML message = new HTML("<div style=\"position:absolute; top:10px; left:10px;\">" +
                "გთხოვთ გვესტუმროთ მოგვიანებით." +
                "</div>");
        RootLayoutPanel.get().add(message);
    }
}