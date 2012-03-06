package ge.lanmaster.onmap.root.client.ui.center;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.ui.Resources;

public class CenterLoadingViewImpl extends Composite implements CenterLoadingView {

    private static CenterLoadingViewImplUiBinder uiBinder = GWT.create(CenterLoadingViewImplUiBinder.class);


    interface CenterLoadingViewImplUiBinder extends UiBinder<Widget, CenterLoadingViewImpl> {
    }

    private CenterGuestView.Presenter presenter;
    private String name;

    @UiField
    Resources resources;
    
    @UiField
    Label loadingLabel;

    //todo: introduce i18n
    @Inject
    public CenterLoadingViewImpl(Resources resources) {
        initWidget((Widget) uiBinder.createAndBindUi(this));
        this.resources = resources;
    }

    public void setName(String name) {
        this.name = name;
        this.loadingLabel.setText(name);
    }

    public void setPresenter(CenterGuestView.Presenter presenter) {
        this.presenter = presenter;
    }
}

