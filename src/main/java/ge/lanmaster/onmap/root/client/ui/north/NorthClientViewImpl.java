package ge.lanmaster.onmap.root.client.ui.north;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.*;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.ClientFactoryImpl;
import ge.lanmaster.onmap.root.client.LoginInfo;

public class NorthClientViewImpl extends Composite implements NorthClientView {

    private static NorthClientViewImplUiBinder uiBinder = GWT.create(NorthClientViewImplUiBinder.class);
    interface NorthClientViewImplUiBinder extends UiBinder<Widget, NorthClientViewImpl> {}

    private Presenter presenter;
    private String name;
    private LoginInfo loginInfo;

    @UiField
    Label userName;
    @UiField
    Anchor logoutLink;

    public NorthClientViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));


        //this.loginInfo = ClientFactoryImpl.App.getInstance().getLoginInfoManager().getLoginInfo();

        //userName.setText(loginInfo.getNickname());
        //logoutLink.setHref(loginInfo.getLogoutUrl());

        //logoutLink.setHref();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
