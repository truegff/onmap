package ge.lanmaster.onmap.root.client.mvp.east;

import com.google.web.bindery.event.shared.EventBus;

public interface EastActivityManagerFactory {
    EastActivityManager create(EventBus eventBus);
}
