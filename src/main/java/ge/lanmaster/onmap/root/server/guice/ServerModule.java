package ge.lanmaster.onmap.root.server.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import ge.lanmaster.onmap.root.server.ServerFactory;
import ge.lanmaster.onmap.root.server.ServerFactoryImpl;

public class ServerModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ServerFactory.class).to(ServerFactoryImpl.class).in(Scopes.SINGLETON);
    }
}
