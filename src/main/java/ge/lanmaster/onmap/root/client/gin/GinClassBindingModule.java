package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ClientFactoryImpl;
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
import ge.lanmaster.onmap.root.client.ui.center.CenterPanel;
import ge.lanmaster.onmap.root.client.ui.east.EastPanel;
import ge.lanmaster.onmap.root.client.ui.north.NorthPanel;
import ge.lanmaster.onmap.root.client.ui.south.SouthPanel;
import ge.lanmaster.onmap.root.client.ui.west.WestPanel;

public class GinClassBindingModule extends AbstractGinModule {

    @Override
    protected void configure() {
        //deprecated
        bind(ClientFactory.class).to(ClientFactoryImpl.class).in(Singleton.class);

        bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
        
        bind(UserStateManager.class).in(Singleton.class);

        bind(NorthActivityMapper.class).in(Singleton.class);
        bind(WestActivityMapper.class).in(Singleton.class);
        bind(CenterActivityMapper.class).in(Singleton.class);
        bind(EastActivityMapper.class).in(Singleton.class);
        bind(SouthActivityMapper.class).in(Singleton.class);
        
        bind(CenterActivityManager.class).in(Singleton.class);
        bind(EastActivityManager.class).in(Singleton.class);
        bind(SouthActivityManager.class).in(Singleton.class);
        bind(NorthActivityManager.class).in(Singleton.class);
        bind(WestActivityManager.class).in(Singleton.class);
        
        bind(CenterPanel.class).in(Singleton.class);
        bind(EastPanel.class).in(Singleton.class);
        bind(NorthPanel.class).in(Singleton.class);
        bind(SouthPanel.class).in(Singleton.class);
        bind(WestPanel.class).in(Singleton.class);
        
        bind(AppPlaceHistoryMapper.class).in(Singleton.class);
        bind(AppPlaceHistoryHandler.class).in(Singleton.class);
        bind(AppPlaceController.class).in(Singleton.class);
    }
}
