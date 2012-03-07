package ge.lanmaster.onmap.root.client.ui.center;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.ui.Resources;

public class CenterClientViewImpl extends Composite implements CenterClientView {

    private static CenterClientViewImplUiBinder uiBinder = GWT.create(CenterClientViewImplUiBinder.class);


    interface CenterClientViewImplUiBinder extends UiBinder<Widget, CenterClientViewImpl> {
    }

    private Presenter presenter;
    private String name;

    @UiField
    Resources resources;

    @UiField
    MenuBar menuBar = new MenuBar();

    @UiField
    MenuItem saveLocAsDefault;

//    @UiField
//    MenuBar menuBar2 = new MenuBar();

    @UiField
    HTMLPanel map;

    @Inject
    public CenterClientViewImpl(Resources resources) {
        this.resources = resources;
        initWidget(uiBinder.createAndBindUi(this));

        saveLocAsDefault.setCommand(new Command() {
            public void execute() {
                Window.alert("Clicked!");
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
