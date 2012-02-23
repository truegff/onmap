package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.manager.UserStateManager;

@GinModules({GinClassBindingModule.class})
public interface GinFactory extends Ginjector {
    ClientFactory getClientFactory();

    UserStateManager getUserStateManager();
}
