package ge.lanmaster.onmap.root.client.ui.east;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;


public class EastBlankViewImpl extends Composite implements EastBlankView{

    private static EastBlankViewImplUiBinder uiBinder = GWT.create(EastBlankViewImplUiBinder.class);
    interface EastBlankViewImplUiBinder extends UiBinder<Widget, EastBlankViewImpl>{}

    private Presenter presenter;
    private String name;

    public EastBlankViewImpl() {
        initWidget((Widget)uiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
