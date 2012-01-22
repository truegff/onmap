package ge.lanmaster.onmap.root.client.ui.south;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SouthGuestViewImpl extends Composite implements SouthGuestView{
    private static SouthGuestViewImplUiBinder uiBinder = GWT.create(SouthGuestViewImplUiBinder.class);

    interface SouthGuestViewImplUiBinder extends UiBinder<Widget, SouthGuestViewImpl> {}

    private Presenter presenter;

    private String name;

    public SouthGuestViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
