package ge.lanmaster.onmap.root.client.mvp.south;

import com.google.web.bindery.event.shared.EventBus;

public interface SouthActivityManagerFactory {
    SouthActivityManager create(EventBus eventBus);
}
