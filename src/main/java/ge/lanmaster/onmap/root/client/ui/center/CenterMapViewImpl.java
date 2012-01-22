package ge.lanmaster.onmap.root.client.ui.center;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class CenterMapViewImpl extends Composite implements CenterGuestView{

    private static CenterGuestViewImplUiBinder uiBinder = GWT.create(CenterGuestViewImplUiBinder.class);
    interface CenterGuestViewImplUiBinder extends UiBinder<Widget, CenterMapViewImpl>{}

    private Presenter presenter;
    private String name;

    public CenterMapViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
 }
