package ge.lanmaster.onmap.root.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;

public abstract class MyAbstractActivity extends AbstractActivity {

    /**
     * Workaround of slow transition to new eventbus location by GWT.
     */

    @Deprecated
    public void start(AcceptsOneWidget panel, com.google.gwt.event.shared.EventBus eventBus) {
        start(panel, (EventBus) eventBus);
    }

    public abstract void start(AcceptsOneWidget panel, EventBus eventBus);

}
