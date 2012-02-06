package ge.lanmaster.onmap.root.server.guice;

import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class ContextListener extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return GuiceFactory.getInjector();
    }
}
