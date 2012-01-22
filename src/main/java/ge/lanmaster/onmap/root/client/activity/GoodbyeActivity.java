//package ge.lanmaster.onmap.root.client.activity;
//
//import com.google.gwt.activity.shared.AbstractActivity;
//import com.google.gwt.event.shared.EventBus;
//import com.google.gwt.user.client.ui.AcceptsOneWidget;
//import ge.lanmaster.onmap.root.client.ClientFactory;
//import ge.lanmaster.onmap.root.client.place.AppLoginPlace;
//import ge.lanmaster.onmap.root.client.ui.GoodbyeView;
//
//public class GoodbyeActivity extends AbstractActivity {
//
//    private ClientFactory clientFactory;
//
//    private String name;
//
//    public GoodbyeActivity(AppLoginPlace place, ClientFactory clientFactory) {
//        this.name = place.getToken();
//        this.clientFactory = clientFactory;
//    }
//
//    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
//        GoodbyeView goodbyeView = clientFactory.getGoodbyeView();
//        goodbyeView.setName(name);
//        containerWidget.setWidget(goodbyeView.asWidget());
//    }
//}
