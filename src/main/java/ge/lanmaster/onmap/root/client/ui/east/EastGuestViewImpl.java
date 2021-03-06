package ge.lanmaster.onmap.root.client.ui.east;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class EastGuestViewImpl extends Composite implements EastGuestView{

    private static EastGuestViewImplUiBinder uiBinder = GWT.create(EastGuestViewImplUiBinder.class);
    interface EastGuestViewImplUiBinder extends UiBinder<Widget, EastGuestViewImpl>{}

    private Presenter presenter;
    private String name;

    public EastGuestViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
