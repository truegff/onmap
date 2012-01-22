package ge.lanmaster.onmap.root.client.activity.north;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ge.lanmaster.onmap.root.client.ClientFactory;
import ge.lanmaster.onmap.root.client.LoginInfo;
import ge.lanmaster.onmap.root.client.place.AppClientPlace;
import ge.lanmaster.onmap.root.client.place.AppGuestPlace;
import ge.lanmaster.onmap.root.client.place.north.NorthGuestPlace;
import ge.lanmaster.onmap.root.client.services.LoginService;
import ge.lanmaster.onmap.root.client.services.LoginServiceAsync;
import ge.lanmaster.onmap.root.client.ui.north.NorthGuestView;

public class NorthGuestActivity extends AbstractActivity implements NorthGuestView.Presenter{

    private ClientFactory clientFactory;
    private String name;

    public NorthGuestActivity(ClientFactory clientFactory, String name) {
        this.name = name;
        this.clientFactory = clientFactory;
        GWT.log(name);
    }

    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        NorthGuestView northGuestView = clientFactory.getNorthGuestView();
        northGuestView.setName(name);
        northGuestView.setPresenter(this);
        containerWidget.setWidget(northGuestView.asWidget());

        tryLogin();
    }

    private void tryLogin() {
        LoginServiceAsync loginService = GWT.create(LoginService.class);
        GWT.log("GWT.getHostPageBaseURL() = "+GWT.getHostPageBaseURL());
        loginService.login(GWT.getHostPageBaseURL(), new AsyncCallback<LoginInfo>() {
            public void onFailure(Throwable caught) {
                //GWT.log("");
            }
            public void onSuccess(LoginInfo result) {
                if (!result.isLoggedIn()) {
                    GWT.log("logged in user: " + result.getEmailAddress());

                    goTo(new AppClientPlace("token"));
                } else {
                    GWT.log("user not logged in");

                    //no action needed
                    //goTo(new AppGuestPlace("linklinklink"));
                }
            }
        });
    }

    public String mayStop() {
        return "Please hold on. This activity is stopping.";
    }

    public void goTo(Place place) {
        clientFactory.getAppPlaceController().goTo(place);
    }
}
