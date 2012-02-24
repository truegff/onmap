package ge.lanmaster.onmap.root.client.mvp.east;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;

public class EastActivityManager extends ActivityManager {
    @Inject
    public EastActivityManager(EastActivityMapper mapper, @Assisted EventBus eventBus) {
        super(mapper, eventBus);
    }
}
