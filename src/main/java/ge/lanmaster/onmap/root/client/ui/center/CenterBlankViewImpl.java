package ge.lanmaster.onmap.root.client.ui.center;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class CenterBlankViewImpl extends Composite implements CenterBlankView {

    private static CenterBlankViewImplUiBinder uiBinder = GWT.create(CenterBlankViewImplUiBinder.class);

    interface CenterBlankViewImplUiBinder extends UiBinder<Widget, CenterBlankViewImpl> {}

    private Presenter presenter;
    private String name;

    public CenterBlankViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
