package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import com.google.inject.Singleton;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ClientFactoryImpl;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;
import ge.lanmaster.onmap.root.client.mvp.NorthActivityMapper;

public class GinClassBindingModule extends AbstractGinModule {

    @Override
    protected void configure() {
        //deprecated
        bind(ClientFactory.class).to(ClientFactoryImpl.class).in(Singleton.class);

        bind(UserStateManager.class).in(Singleton.class);

        bind(NorthActivityMapper.class).in(Singleton.class);

        //proof of concept of assisted injection using custom factory
        install(new GinFactoryModuleBuilder().build(NorthActivityManagerFactory.class));
    }
}
