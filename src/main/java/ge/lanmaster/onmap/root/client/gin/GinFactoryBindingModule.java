package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import ge.lanmaster.onmap.root.client.activity.center.CenterActivityFactory;
import ge.lanmaster.onmap.root.client.activity.north.NorthActivityFactory;

public class GinFactoryBindingModule extends AbstractGinModule {
    @Override
    protected void configure() {
        install(new GinFactoryModuleBuilder().build(NorthActivityFactory.class));
        install(new GinFactoryModuleBuilder().build(CenterActivityFactory.class));
    }
}
