package ge.lanmaster.onmap.root.client.ui.west;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class WestNoneViewImpl extends Composite implements WestNoneView{
    private static WestNoneViewImplUiBinder uiBinder = GWT.create(WestNoneViewImplUiBinder.class);
    interface WestNoneViewImplUiBinder extends UiBinder<Widget, WestNoneViewImpl>{}

    private Presenter presenter;
    private String name;

    public WestNoneViewImpl () {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void setName(String name) {
        this.name = name;
    }
}
