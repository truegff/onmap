package ge.lanmaster.onmap.root.client.mvp.north;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;

public class NorthActivityManager extends ActivityManager {
    @Inject
    public NorthActivityManager(NorthActivityMapper mapper, EventBus eventBus) {
        super(mapper, eventBus);
    }
}
