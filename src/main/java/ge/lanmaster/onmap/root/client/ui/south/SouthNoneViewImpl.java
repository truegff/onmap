package ge.lanmaster.onmap.root.client.ui.south;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SouthNoneViewImpl extends Composite implements SouthNoneView{

    private static SouthNoneViewImplUiBinder uiBinder = GWT.create(SouthNoneViewImplUiBinder.class);
    interface SouthNoneViewImplUiBinder extends UiBinder<Widget, SouthNoneViewImpl> {}

    private Presenter presenter;
    private String name;

    public SouthNoneViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
