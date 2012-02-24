package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import ge.lanmaster.onmap.root.client.mvp.center.CenterActivityManagerFactory;
import ge.lanmaster.onmap.root.client.mvp.east.EastActivityManagerFactory;
import ge.lanmaster.onmap.root.client.mvp.north.NorthActivityManagerFactory;
import ge.lanmaster.onmap.root.client.mvp.south.SouthActivityManagerFactory;
import ge.lanmaster.onmap.root.client.mvp.west.WestActivityManagerFactory;

public class GinFactoryBindingModule extends AbstractGinModule {
    @Override
    protected void configure() {
        install(new GinFactoryModuleBuilder().build(NorthActivityManagerFactory.class));
        install(new GinFactoryModuleBuilder().build(WestActivityManagerFactory.class));
        install(new GinFactoryModuleBuilder().build(CenterActivityManagerFactory.class));
        install(new GinFactoryModuleBuilder().build(EastActivityManagerFactory.class));
        install(new GinFactoryModuleBuilder().build(SouthActivityManagerFactory.class));
    }
}
