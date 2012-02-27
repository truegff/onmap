package ge.lanmaster.onmap.root.client.mvp.center;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;

public class CenterActivityManager extends ActivityManager {
    @Inject
    public CenterActivityManager(CenterActivityMapper mapper, EventBus eventBus) {
        super(mapper, eventBus);
    }
}
