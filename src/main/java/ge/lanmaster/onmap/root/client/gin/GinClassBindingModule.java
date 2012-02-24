package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ClientFactoryImpl;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;
import ge.lanmaster.onmap.root.client.mvp.center.CenterActivityMapper;
import ge.lanmaster.onmap.root.client.mvp.east.EastActivityMapper;
import ge.lanmaster.onmap.root.client.mvp.north.NorthActivityMapper;
import ge.lanmaster.onmap.root.client.mvp.south.SouthActivityMapper;
import ge.lanmaster.onmap.root.client.mvp.west.WestActivityMapper;

public class GinClassBindingModule extends AbstractGinModule {

    @Override
    protected void configure() {
        //deprecated
        bind(ClientFactory.class).to(ClientFactoryImpl.class).in(Singleton.class);

        bind(UserStateManager.class).in(Singleton.class);

        bind(NorthActivityMapper.class).in(Singleton.class);
        bind(WestActivityMapper.class).in(Singleton.class);
        bind(CenterActivityMapper.class).in(Singleton.class);
        bind(EastActivityMapper.class).in(Singleton.class);
        bind(SouthActivityMapper.class).in(Singleton.class);
    }
}
