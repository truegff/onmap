package ge.lanmaster.onmap.root.client.ui.center;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.event.center.menubar.SaveCurrentMapConfigEvent;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.ui.Resources;

public class CenterClientViewImpl extends Composite implements CenterClientView {

    private static CenterClientViewImplUiBinder uiBinder = GWT.create(CenterClientViewImplUiBinder.class);
    private GinFactory injector;


    interface CenterClientViewImplUiBinder extends UiBinder<Widget, CenterClientViewImpl> {
    }

    private Presenter presenter;
    private String name;

    @UiField
    Resources resources;

    @UiField
    MenuBar menuBar = new MenuBar();

    @UiField
    MenuItem saveCurrentMapConfig;

    @UiField
    MenuItem preferences;


//    @UiField
//    MenuBar menuBar2 = new MenuBar();

    @UiField
    HTMLPanel map;

    @Inject
    public CenterClientViewImpl(Resources resources, final GinFactory injector) {
        this.resources = resources;
        this.injector = injector;
        initWidget(uiBinder.createAndBindUi(this));

        preferences.setText("Preferences");
        saveCurrentMapConfig.setText("Save current location as default.");
        saveCurrentMapConfig.setCommand(new Command() {
            public void execute() {
                injector.getEventBus().fireEvent(new SaveCurrentMapConfigEvent());
            }
        });

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void addWidget(Widget widget) {
        map.add(widget);
    }
}
