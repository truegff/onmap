package ge.lanmaster.onmap.root.client.ui.north;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.gin.GinFactory;

public class NorthGuestViewImpl extends Composite implements NorthGuestView {

    private static NorthGuestViewImplUiBinder uiBinder = GWT.create(NorthGuestViewImplUiBinder.class);

    interface NorthGuestViewImplUiBinder extends UiBinder<Widget, NorthGuestViewImpl> {
    }

    private Presenter presenter;
    private String name;

    @UiField
    Anchor loginLink;

    @UiHandler("loginLink")
    void onClickLoginLink(ClickEvent event) {
        GWT.log("Login Link clicked.");

        //presenter.goTo(new AppLoginPlace("someToken"));
    }

    public NorthGuestViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    protected void onAttach() {
        super.onAttach();

        loginLink.setHref(presenter.getUserStateManager().getUserState().getLoginUrl());

        //todo: make i18n compatible
        loginLink.setText("შესვლა");
    }
}
