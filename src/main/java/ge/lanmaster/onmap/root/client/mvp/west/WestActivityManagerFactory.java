package ge.lanmaster.onmap.root.client.mvp.west;

import com.google.web.bindery.event.shared.EventBus;

public interface WestActivityManagerFactory {
    WestActivityManager create(EventBus eventBus);
}
