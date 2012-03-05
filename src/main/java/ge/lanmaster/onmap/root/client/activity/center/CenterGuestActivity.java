package ge.lanmaster.onmap.root.client.activity.center;

import com.google.gwt.core.client.GWT;
import com.google.gwt.maps.client.MapType;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.geom.LatLng;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.activity.MyAbstractActivity;
import ge.lanmaster.onmap.root.client.entity.MapConfig;
import ge.lanmaster.onmap.root.client.event.center.IMapReadyEventHandler;
import ge.lanmaster.onmap.root.client.event.center.MapReadyEvent;
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

    public void start(final AcceptsOneWidget containerWidget, final EventBus eventBus) {
        CenterLoadingView centerLoadingView = injector.getCenterLoadingView();
        centerLoadingView.setName("LOADING");
        centerLoadingView.setPresenter(this);
        containerWidget.setWidget(centerLoadingView.asWidget());


        final CenterGuestView centerGuestView = injector.getCenterGuestView();
        centerGuestView.setPresenter(this);

        eventBus.addHandler(MapReadyEvent.TYPE, new IMapReadyEventHandler() {
            public void onMapReady(MapReadyEvent event) {
                if (MapReadyEvent.getMapConfigPreloaded() && MapReadyEvent.getMapWidgetPreloaded()) {
                    GWT.log("Everything is ready for map rendering.");

                    MapConfig mc = injector.getMapConfigManager().getMapConfig();

                    LatLng mapCenter = LatLng.newInstance(mc.getPoint().getLatitude(), mc.getPoint().getLongitude());

                    final MapWidget mapWidget = new MapWidget(mapCenter, mc.getZoom());
                    mapWidget.setSize("100%", "100%");

                    if (mc.getMapType().equalsIgnoreCase("hybrid")) {
                        mapWidget.setCurrentMapType(MapType.getHybridMap());
                    }

                    mapWidget.checkResizeAndCenter();

                    centerGuestView.addWidget(mapWidget.asWidget());
                    centerGuestView.setName(name);
                    containerWidget.setWidget(centerGuestView.asWidget());

                }
            }
        });

        injector.getMapConfigManager().retrieveMapConfig();
        injector.getMapPreloadManager().doPreload();

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
