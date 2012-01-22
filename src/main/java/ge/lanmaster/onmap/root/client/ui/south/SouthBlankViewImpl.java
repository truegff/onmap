package ge.lanmaster.onmap.root.client.ui.south;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SouthBlankViewImpl extends Composite implements SouthBlankView{
    private static SouthBlankViewImplUiBinder uiBinder = GWT.create(SouthBlankViewImplUiBinder.class);
    interface SouthBlankViewImplUiBinder extends UiBinder<Widget, SouthBlankViewImpl>{}

    private Presenter presenter;
    private String name;

    public SouthBlankViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }
}
