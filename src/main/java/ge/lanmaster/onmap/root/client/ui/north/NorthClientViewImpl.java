package ge.lanmaster.onmap.root.client.ui.north;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import ge.lanmaster.onmap.root.client.UserState;

public class NorthClientViewImpl extends Composite implements NorthClientView {

    private static NorthClientViewImplUiBinder uiBinder = GWT.create(NorthClientViewImplUiBinder.class);
    interface NorthClientViewImplUiBinder extends UiBinder<Widget, NorthClientViewImpl> {}

    private Presenter presenter;
    private String name;
    private UserState userState;

    @UiField
    Label userName;
    @UiField
    Anchor logoutLink;
    @UiField
    Label welcomeLabel;

    public NorthClientViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));


        //this.userState = ClientFactoryImpl.App.getInstance().getLoginInfoManager().getLoginInfo();

        //userName.setText(userState.getNickname());
        //logoutLink.setHref(userState.getLogoutUrl());

        //logoutLink.setHref();
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

        userName.setText(presenter.getClientFactory().getUserStateManager().getUserState().getNickname());
        logoutLink.setHref(presenter.getClientFactory().getUserStateManager().getUserState().getLogoutUrl());

        //todo: has to be made i18n compatible
        welcomeLabel.setText("მოგესალმებით, ");
        logoutLink.setText("გასვლა");
    }
}
