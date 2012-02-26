package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import ge.lanmaster.onmap.root.client.activity.north.NorthClientActivityFactory;
import ge.lanmaster.onmap.root.client.activity.north.NorthGuestActivityFactory;

public class GinFactoryBindingModule extends AbstractGinModule {
    @Override
    protected void configure() {
        install(new GinFactoryModuleBuilder().build(NorthClientActivityFactory.class));
        install(new GinFactoryModuleBuilder().build(NorthGuestActivityFactory.class));
    }
}
