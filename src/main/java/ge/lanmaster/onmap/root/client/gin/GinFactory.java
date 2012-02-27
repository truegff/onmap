package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.activity.center.CenterActivityFactory;
import ge.lanmaster.onmap.root.client.activity.east.EastActivityFactory;
import ge.lanmaster.onmap.root.client.activity.north.NorthActivityFactory;
import ge.lanmaster.onmap.root.client.activity.south.SouthActivityFactory;
import ge.lanmaster.onmap.root.client.activity.west.WestActivityFactory;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;
import ge.lanmaster.onmap.root.client.mvp.AppPlaceController;
import ge.lanmaster.onmap.root.client.mvp.AppPlaceHistoryHandler;
import ge.lanmaster.onmap.root.client.mvp.AppPlaceHistoryMapper;
import ge.lanmaster.onmap.root.client.mvp.center.CenterActivityManager;
import ge.lanmaster.onmap.root.client.mvp.center.CenterActivityMapper;
import ge.lanmaster.onmap.root.client.mvp.east.EastActivityManager;
import ge.lanmaster.onmap.root.client.mvp.east.EastActivityMapper;
import ge.lanmaster.onmap.root.client.mvp.north.NorthActivityManager;
import ge.lanmaster.onmap.root.client.mvp.north.NorthActivityMapper;
import ge.lanmaster.onmap.root.client.mvp.south.SouthActivityManager;
import ge.lanmaster.onmap.root.client.mvp.south.SouthActivityMapper;
import ge.lanmaster.onmap.root.client.mvp.west.WestActivityManager;
import ge.lanmaster.onmap.root.client.mvp.west.WestActivityMapper;
import ge.lanmaster.onmap.root.client.ui.center.CenterClientView;
import ge.lanmaster.onmap.root.client.ui.center.CenterGuestView;
import ge.lanmaster.onmap.root.client.ui.center.CenterPanel;
import ge.lanmaster.onmap.root.client.ui.east.EastGuestView;
import ge.lanmaster.onmap.root.client.ui.east.EastPanel;
import ge.lanmaster.onmap.root.client.ui.north.NorthClientView;
import ge.lanmaster.onmap.root.client.ui.north.NorthGuestView;
import ge.lanmaster.onmap.root.client.ui.north.NorthPanel;
import ge.lanmaster.onmap.root.client.ui.south.SouthGuestView;
import ge.lanmaster.onmap.root.client.ui.south.SouthPanel;
import ge.lanmaster.onmap.root.client.ui.west.WestGuestView;
import ge.lanmaster.onmap.root.client.ui.west.WestPanel;

@GinModules({GinClassBindingModule.class, GinFactoryBindingModule.class})
public interface GinFactory extends Ginjector {

    // generic
    // self
    GinFactory getGinFactory();

    // generic
    EventBus getEventBus();

    UserStateManager getUserStateManager();

    AppPlaceHistoryMapper getAppPlaceHistoryMapper();

    AppPlaceHistoryHandler getAppPlaceHistoryHandler();

    AppPlaceController getAppPlaceController();

    // Panels
    CenterPanel getCenterPanel();

    EastPanel getEastPanel();

    NorthPanel getNorthPanel();

    SouthPanel getSouthPanel();

    WestPanel getWestPanel();

    // ActivityMappers
    NorthActivityMapper getNorthActivityMapper();

    WestActivityMapper getWestActivityMapper();

    CenterActivityMapper getCenterActivityMapper();

    EastActivityMapper getEastActivityMapper();

    SouthActivityMapper getSouthActivityMapper();

    // ActivityManagers
    NorthActivityManager getNorthActivityManager();

    WestActivityManager getWestActivityManager();

    CenterActivityManager getCenterActivityManager();

    EastActivityManager getEastActivityManager();

    SouthActivityManager getSouthActivityManager();

    // Views
    NorthGuestView getNorthGuestView();

    NorthClientView getNorthClientView();

    CenterGuestView getCenterGuestView();

    CenterClientView getCenterClientView();

    EastGuestView getEastGuestView();

    SouthGuestView getSouthGuestView();

    WestGuestView getWestGuestView();

    // ActivityFactories
    NorthActivityFactory getNorthActivityFactory();

    CenterActivityFactory getCenterActivityFactory();

    EastActivityFactory getEastActivityFactory();

    SouthActivityFactory getSouthActivityFactory();

    WestActivityFactory getWestActivityFactory();

}
