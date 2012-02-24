package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;
import ge.lanmaster.onmap.root.client.mvp.AppPlaceHistoryHandler;
import ge.lanmaster.onmap.root.client.mvp.AppPlaceHistoryMapper;
import ge.lanmaster.onmap.root.client.mvp.center.CenterActivityManagerFactory;
import ge.lanmaster.onmap.root.client.mvp.center.CenterActivityMapper;
import ge.lanmaster.onmap.root.client.mvp.east.EastActivityManagerFactory;
import ge.lanmaster.onmap.root.client.mvp.east.EastActivityMapper;
import ge.lanmaster.onmap.root.client.mvp.north.NorthActivityManagerFactory;
import ge.lanmaster.onmap.root.client.mvp.north.NorthActivityMapper;
import ge.lanmaster.onmap.root.client.mvp.south.SouthActivityManagerFactory;
import ge.lanmaster.onmap.root.client.mvp.south.SouthActivityMapper;
import ge.lanmaster.onmap.root.client.mvp.west.WestActivityManagerFactory;
import ge.lanmaster.onmap.root.client.mvp.west.WestActivityMapper;
import ge.lanmaster.onmap.root.client.ui.center.CenterPanel;
import ge.lanmaster.onmap.root.client.ui.east.EastPanel;
import ge.lanmaster.onmap.root.client.ui.north.NorthPanel;
import ge.lanmaster.onmap.root.client.ui.south.SouthPanel;
import ge.lanmaster.onmap.root.client.ui.west.WestPanel;

@GinModules({GinClassBindingModule.class, GinFactoryBindingModule.class})
public interface GinFactory extends Ginjector {
    ClientFactory getClientFactory();

    UserStateManager getUserStateManager();

    NorthActivityMapper getNorthActivityMapper();

    WestActivityMapper getWestActivityMapper();

    CenterActivityMapper getCenterActivityMapper();

    EastActivityMapper getEastActivityMapper();

    SouthActivityMapper getSouthActivityMapper();


    CenterPanel getCenterPanel();

    EastPanel getEastPanel();

    NorthPanel getNorthPanel();

    SouthPanel getSouthPanel();

    WestPanel getWestPanel();


    NorthActivityManagerFactory getNorthActivityManagerFactory();

    WestActivityManagerFactory getWestActivityManagerFactory();

    CenterActivityManagerFactory getCenterActivityManagerFactory();

    EastActivityManagerFactory getEastActivityManagerFactory();

    SouthActivityManagerFactory getSouthActivityManagerFactory();

    AppPlaceHistoryMapper getAppPlaceHistoryMapper();

    AppPlaceHistoryHandler getAppPlaceHistoryHandler();
}
