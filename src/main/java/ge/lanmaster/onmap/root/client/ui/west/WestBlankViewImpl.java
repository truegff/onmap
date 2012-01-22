package ge.lanmaster.onmap.root.client.ui.west;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class WestBlankViewImpl extends Composite implements WestBlankView{

    private static WestBlankViewImplUiBinder uiBinder = GWT.create(WestBlankViewImplUiBinder.class);
    interface WestBlankViewImplUiBinder extends UiBinder<Widget, WestBlankViewImpl>{}

    private Presenter presenter;
    private String name;

    public WestBlankViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
