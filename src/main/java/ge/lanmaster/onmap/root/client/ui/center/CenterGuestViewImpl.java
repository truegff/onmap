package ge.lanmaster.onmap.root.client.ui.center;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class CenterGuestViewImpl extends Composite implements CenterGuestView {

    private static CenterGuestViewImplUiBinder uiBinder = GWT.create(CenterGuestViewImplUiBinder.class);


    interface CenterGuestViewImplUiBinder extends UiBinder<Widget, CenterGuestViewImpl> {
    }

    private Presenter presenter;
    private String name;

    @UiField
    HTMLPanel map;

    public CenterGuestViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWidget(Widget widget) {
        map.add(widget);
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
