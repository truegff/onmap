//package ge.lanmaster.onmap.root.client.activity;
//
//import com.google.gwt.activity.shared.AbstractActivity;
//import com.google.gwt.event.shared.EventBus;
//import com.google.gwt.place.shared.Place;
//import com.google.gwt.user.client.ui.AcceptsOneWidget;
//import ge.lanmaster.onmap.root.client.ClientFactory;
//import ge.lanmaster.onmap.root.client.place.HelloPlace;
//import ge.lanmaster.onmap.root.client.ui.HelloView;
//
//public class HelloActivity extends AbstractActivity implements HelloView.Presenter {
//
//    private ClientFactory clientFactory;
//    private String name;
//
//    public HelloActivity(HelloPlace helloPlace, ClientFactory clientFactory) {
//        this.name = helloPlace.getHelloName();
//        this.clientFactory = clientFactory;
//    }
//
//    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
//        HelloView helloView = clientFactory.getHelloView();
//        helloView.setName(name);
//        helloView.setPresenter(this);
//        containerWidget.setWidget(helloView.asWidget());
//    }
//
//    public String mayStop(){
//        return "Please hold on. This activity is stopping.";
//    }
//
//    public void goTo(Place place) {
//        clientFactory.getCenterPlaceController().goTo(place);
//    }
//}
