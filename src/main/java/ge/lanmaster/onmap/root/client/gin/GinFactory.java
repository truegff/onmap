package ge.lanmaster.onmap.root.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.ClientFactory;

@GinModules({GinClassBindingModule.class})
public interface GinFactory extends Ginjector {
    ClientFactory getClientFactory();
}
