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
    HTMLPanel map;

    @Inject
    public CenterClientViewImpl(Resources resources) {
        initWidget(uiBinder.createAndBindUi(this));
        this.resources = resources;

        menuBar.addItem(new MenuItem("OLOLO", new Command() {
            public void execute() {
                Window.alert("OLOLO");
            }
        }));

        Command cmd = new Command() {
            public void execute() {
                Window.alert("You selected a menu item!");
            }
        };

        MenuBar fooMenu = new MenuBar(true);
        fooMenu.addItem("the", cmd);
        fooMenu.addItem("foo", cmd);
        fooMenu.addItem("menu", cmd);

        MenuBar barMenu = new MenuBar(true);
        barMenu.addItem("the", cmd);
        barMenu.addItem("bar", cmd);
        barMenu.addItem("menu", cmd);

        MenuBar bazMenu = new MenuBar(true);
        bazMenu.addItem("the", cmd);
        bazMenu.addItem("baz", cmd);
        bazMenu.addItem("menu", cmd);

        // Make a new menu bar, adding a few cascading menus to it.
        menuBar.addItem("foo", fooMenu);
        menuBar.addItem("bar", barMenu);
        menuBar.addItem("baz", bazMenu);
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
