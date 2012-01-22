package ge.lanmaster.onmap.root.client.ui.east;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class EastNoneViewImpl extends Composite implements EastNoneView{

    private static EastNoneViewImplUiBinder uiBinder = GWT.create(EastNoneViewImplUiBinder.class);
    interface EastNoneViewImplUiBinder extends UiBinder<Widget, EastNoneViewImpl>{}

    private Presenter presenter;
    private String name;

    public EastNoneViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
