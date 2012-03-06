package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import ge.lanmaster.onmap.root.client.ui.Resources;

import javax.inject.Singleton;

public class GinStyleBindingModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(Resources.class).in(Singleton.class);
    }
}
