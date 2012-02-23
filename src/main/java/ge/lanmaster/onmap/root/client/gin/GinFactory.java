package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;
import ge.lanmaster.onmap.root.client.mvp.north.NorthActivityManagerFactory;
import ge.lanmaster.onmap.root.client.mvp.north.NorthActivityMapper;

@GinModules({GinClassBindingModule.class})
public interface GinFactory extends Ginjector {
    ClientFactory getClientFactory();

    UserStateManager getUserStateManager();

    NorthActivityMapper getNorthActivityMapper();

    NorthActivityManagerFactory getNorthActivityManagerFactory();
}
