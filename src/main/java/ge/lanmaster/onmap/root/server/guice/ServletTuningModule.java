package ge.lanmaster.onmap.root.server.guice;

import com.google.inject.Scopes;
import com.google.inject.servlet.ServletModule;
import ge.lanmaster.onmap.root.server.service.LoginServiceImpl;

public class ServletTuningModule extends ServletModule {
    @Override
    protected void configureServlets() {
        bind(LoginServiceImpl.class).in(Scopes.SINGLETON);
        serve("/root/login").with(LoginServiceImpl.class);
    }

}
