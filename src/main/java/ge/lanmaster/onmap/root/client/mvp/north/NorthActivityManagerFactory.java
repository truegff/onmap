package ge.lanmaster.onmap.root.client.mvp.north;

import com.google.web.bindery.event.shared.EventBus;

public interface NorthActivityManagerFactory {
    NorthActivityManager create(EventBus eventBus);
}
