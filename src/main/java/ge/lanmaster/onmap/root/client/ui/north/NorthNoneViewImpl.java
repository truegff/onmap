package ge.lanmaster.onmap.root.client.ui.north;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class NorthNoneViewImpl extends Composite implements NorthNoneView{
    private static NorthNoneViewImplUiBinder uiBinder = GWT.create(NorthNoneViewImplUiBinder.class);
    interface NorthNoneViewImplUiBinder extends UiBinder<Widget, NorthNoneViewImpl>{}

    private Presenter presenter;
    private String name;

    public NorthNoneViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
