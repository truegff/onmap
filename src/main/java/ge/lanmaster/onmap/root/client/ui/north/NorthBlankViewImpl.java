package ge.lanmaster.onmap.root.client.ui.north;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class NorthBlankViewImpl extends Composite implements NorthBlankView{
    private static NorthBlankViewImplUiBinder uiBinder = GWT.create(NorthBlankViewImplUiBinder.class);
    interface NorthBlankViewImplUiBinder extends UiBinder<Widget, NorthBlankViewImpl>{}

    private Presenter presenter;
    private String name;

    public NorthBlankViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
