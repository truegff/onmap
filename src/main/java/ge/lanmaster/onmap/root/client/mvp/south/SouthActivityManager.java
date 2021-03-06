package ge.lanmaster.onmap.root.client.mvp.south;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;

public class SouthActivityManager extends ActivityManager {
    @Inject
    public SouthActivityManager(SouthActivityMapper mapper, EventBus eventBus) {
        super(mapper, eventBus);
    }
}
