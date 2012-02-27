package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import ge.lanmaster.onmap.root.client.activity.center.CenterActivityFactory;
import ge.lanmaster.onmap.root.client.activity.east.EastActivityFactory;
import ge.lanmaster.onmap.root.client.activity.north.NorthActivityFactory;
import ge.lanmaster.onmap.root.client.activity.south.SouthActivityFactory;
import ge.lanmaster.onmap.root.client.activity.west.WestActivityFactory;

public class GinFactoryBindingModule extends AbstractGinModule {
    @Override
    protected void configure() {
        install(new GinFactoryModuleBuilder().build(NorthActivityFactory.class));
        install(new GinFactoryModuleBuilder().build(CenterActivityFactory.class));
        install(new GinFactoryModuleBuilder().build(EastActivityFactory.class));
        install(new GinFactoryModuleBuilder().build(SouthActivityFactory.class));
        install(new GinFactoryModuleBuilder().build(WestActivityFactory.class));
    }
}
