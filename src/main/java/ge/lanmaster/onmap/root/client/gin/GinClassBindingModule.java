package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ClientFactoryImpl;

public class GinClassBindingModule extends AbstractGinModule {

    @Override
    protected void configure() {
        bind(ClientFactory.class).to(ClientFactoryImpl.class).in(Singleton.class);
    }
}
