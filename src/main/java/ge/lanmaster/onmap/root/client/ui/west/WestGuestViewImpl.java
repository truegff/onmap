package ge.lanmaster.onmap.root.client.ui.west;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class WestGuestViewImpl extends Composite implements WestGuestView{
    private static WestGuestViewImplUiBinder uiBinder = GWT.create(WestGuestViewImplUiBinder.class);
    interface WestGuestViewImplUiBinder extends UiBinder<Widget, WestGuestViewImpl>{}

    private Presenter presenter;
    private String name;

    public WestGuestViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void setName(String name) {
        this.name = name;
    }
}
