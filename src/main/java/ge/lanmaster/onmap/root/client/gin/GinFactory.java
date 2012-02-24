package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;
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

@GinModules({GinClassBindingModule.class, GinFactoryBindingModule.class})
public interface GinFactory extends Ginjector {
    ClientFactory getClientFactory();

    UserStateManager getUserStateManager();

    NorthActivityMapper getNorthActivityMapper();

    WestActivityMapper getWestActivityMapper();

    CenterActivityMapper getCenterActivityMapper();

    EastActivityMapper getEastActivityMapper();

    SouthActivityMapper getSouthActivityMapper();

    NorthActivityManagerFactory getNorthActivityManagerFactory();

    WestActivityManagerFactory getWestActivityManagerFactory();

    CenterActivityManagerFactory getCenterActivityManagerFactory();

    EastActivityManagerFactory getEastActivityManagerFactory();

    SouthActivityManagerFactory getSouthActivityManagerFactory();
}
