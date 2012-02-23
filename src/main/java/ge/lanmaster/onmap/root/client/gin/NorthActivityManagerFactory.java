package ge.lanmaster.onmap.root.client.gin;

import com.google.web.bindery.event.shared.EventBus;

public interface NorthActivityManagerFactory {
    NorthActivityManager create(EventBus eventBus);
}
