package ge.lanmaster.onmap.root.client.activity.center;

import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.Maps;
import com.google.gwt.maps.client.control.LargeMapControl;
import com.google.gwt.maps.client.control.MenuMapTypeControl;
import com.google.gwt.maps.client.geom.LatLng;
import com.google.gwt.maps.client.overlay.Marker;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.activity.MyAbstractActivity;
import ge.lanmaster.onmap.root.client.event.center.MapLoadedEvent;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.ui.center.CenterGuestView;
import ge.lanmaster.onmap.root.client.ui.center.CenterLoadingView;

public class CenterGuestActivity extends MyAbstractActivity implements CenterGuestView.Presenter {

    private GinFactory injector;
    private String name;

    @Inject
    public CenterGuestActivity(GinFactory injector, @Assisted String name) {
        this.injector = injector;
        this.name = name;
    }

    public void start(final AcceptsOneWidget containerWidget, EventBus eventBus) {
        CenterLoadingView centerLoadingView = injector.getCenterLoadingView();
        centerLoadingView.setName("LOADING");
        centerLoadingView.setPresenter(this);
        containerWidget.setWidget(centerLoadingView.asWidget());

        final CenterGuestView centerGuestView = injector.getCenterGuestView();

        //todo: map preferences download


        //todo: map preload

        Maps.loadMapsApi("", "2", false, new Runnable() {
            public void run() {
                //todo: get default users location by here as variable latLng;

                //GWT.log(" ");
                //GWT.log("Creating latlng (map center object)");
                LatLng latLng = LatLng.newInstance(39.509, -98.434);
                //GWT.log("latLng = "+latLng.toString());
                //GWT.log("IS MAPS LOADED? : "+String.valueOf(Maps.isLoaded()));

                //GWT.log(" ");
                //GWT.log("Creating mapWidget");
                final MapWidget mapWidget = new MapWidget(latLng, 2);
                //GWT.log("mapWidget created.");

                //GWT.log(" ");
                //GWT.log("Setting mapWidget size to 100%x100%.");
                mapWidget.setSize("100%", "100%");
                //GWT.log("Successfully set size.");


                mapWidget.addControl(new LargeMapControl());
                mapWidget.addControl(new MenuMapTypeControl());
                mapWidget.addOverlay(new Marker(latLng));
                mapWidget.checkResizeAndCenter();

                centerGuestView.addWidget(mapWidget.asWidget());
                //GWT.log(" ");
                //GWT.log("mapWidgetRelated tasks all done");
                //Window.alert(mapWidget.toString());
                getEventBus().fireEvent(new MapLoadedEvent());
                containerWidget.setWidget(centerGuestView.asWidget());
            }
        });


        centerGuestView.setName(name);
        centerGuestView.setPresenter(this);
        //containerWidget.setWidget(centerGuestView.asWidget());

    }

    public void goTo(Place place) {
        injector.getAppPlaceController().goTo(place);
    }

    public EventBus getEventBus() {
        return injector.getEventBus();
    }


    public String mayStop() {
        return null;
        //return "Please hold on. This activity is stopping.";
    }
}
