package ge.lanmaster.onmap.root.client.ui.center;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class CenterClientViewImpl extends Composite implements CenterClientView {

    private static CenterClientViewImplUiBinder uiBinder = GWT.create(CenterClientViewImplUiBinder.class);


    interface CenterClientViewImplUiBinder extends UiBinder<Widget, CenterClientViewImpl> {
    }

    private Presenter presenter;
    private String name;

    @UiField
    HTMLPanel map;

    public CenterClientViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
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
