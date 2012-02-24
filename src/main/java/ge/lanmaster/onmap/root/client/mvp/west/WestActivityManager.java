package ge.lanmaster.onmap.root.client.mvp.west;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;

public class WestActivityManager extends ActivityManager {
    @Inject
    public WestActivityManager(WestActivityMapper mapper, EventBus eventBus) {
        super(mapper, eventBus);
    }
}
