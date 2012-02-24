package ge.lanmaster.onmap.root.client.mvp.center;

import com.google.web.bindery.event.shared.EventBus;

public interface CenterActivityManagerFactory {
    CenterActivityManager create(EventBus eventBus);
}
