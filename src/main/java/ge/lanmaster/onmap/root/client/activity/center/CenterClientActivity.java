package ge.lanmaster.onmap.root.client.activity.center;

import com.google.appengine.api.datastore.GeoPt;
import com.google.gwt.core.client.GWT;
import com.google.gwt.maps.client.MapType;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.geom.LatLng;
import com.google.gwt.maps.client.overlay.Marker;
import com.google.gwt.maps.client.overlay.MarkerOptions;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;
import ge.lanmaster.onmap.root.client.activity.MyAbstractActivity;
import ge.lanmaster.onmap.root.client.entity.MapConfig;
import ge.lanmaster.onmap.root.client.event.center.IMapReadyEventHandler;
import ge.lanmaster.onmap.root.client.event.center.MapReadyEvent;
import ge.lanmaster.onmap.root.client.event.center.menubar.*;
import ge.lanmaster.onmap.root.client.gin.GinFactory;
import ge.lanmaster.onmap.root.client.manager.MapWidgetManager;
import ge.lanmaster.onmap.root.client.ui.center.CenterClientView;
import ge.lanmaster.onmap.root.client.ui.center.CenterLoadingView;

public class CenterClientActivity extends MyAbstractActivity implements CenterClientView.Presenter {

    private GinFactory injector;
    private String name;

    @Inject
    public CenterClientActivity(GinFactory injector, @Assisted String name) {
        this.injector = injector;
        this.name = name;
    }

    public void start(final AcceptsOneWidget containerWidget, EventBus eventBus) {
        CenterLoadingView centerLoadingView = injector.getCenterLoadingView();
        centerLoadingView.setName("LOADING");
        //centerLoadingView.setPresenter(this);
        containerWidget.setWidget(centerLoadingView.asWidget());


        final CenterClientView centerClientView = injector.getCenterClientView();
        centerClientView.setPresenter(this);

        eventBus.addHandler(MapReadyEvent.TYPE, new IMapReadyEventHandler() {
            public void onMapReady(MapReadyEvent event) {
                GWT.log("onmapReady " + event.toString());
                if (MapReadyEvent.getMapConfigPreloaded() && MapReadyEvent.getMapWidgetPreloaded()) {
                    GWT.log("Everything is ready for map rendering.");

                    MapConfig mc = injector.getMapConfigManager().getMapConfig();

                    LatLng mapCenter = LatLng.newInstance(mc.getPoint().getLatitude(), mc.getPoint().getLongitude());

                    final MapWidget mapWidget = new MapWidget(mapCenter, mc.getZoom());
                    MapWidgetManager.setMapWidget(mapWidget);

                    mapWidget.setSize("100%", "100%");

                    if (mc.getMapType().equalsIgnoreCase("Hybrid")) {
                        mapWidget.setCurrentMapType(MapType.getHybridMap());
                    }

                    mapWidget.checkResizeAndCenter();

                    centerClientView.addWidget(mapWidget.asWidget());
                    centerClientView.setName(name);
                    containerWidget.setWidget(centerClientView.asWidget());
                }
            }
        });

        eventBus.addHandler(SaveCurrentMapConfigEvent.TYPE, new SaveCurrentMapConfigEventHandler() {
            public void onSaveCurrentMapConfig(SaveCurrentMapConfigEvent event) {
                //Window.alert("Event received. Proceeding...");

                MapWidget mw = MapWidgetManager.getMapWidget();
                String id = injector.getUserStateManager().getUserState().getEmailAddress();
                GeoPt center = new GeoPt((float) mw.getCenter().getLatitude(), (float) mw.getCenter().getLongitude());
                MapConfig mc = new MapConfig(id, center, mw.getZoomLevel(), mw.getCurrentMapType().getName(false));

                injector.getMapConfigManager().setMapConfig(mc);
                injector.getMapConfigManager().storeMapConfig();

                //injector.getMapConfigManager().
            }
        });

        eventBus.addHandler(RestoreDefaultMapConfigEvent.TYPE, new RestoreDefaultMapConfigEventHandler() {
            public void onRestoreDefaultMapConfig(RestoreDefaultMapConfigEvent event) {
                MapWidget mw = MapWidgetManager.getMapWidget();
                MapConfig mc = injector.getMapConfigManager().getMapConfig();

                LatLng ll = LatLng.newInstance(mc.getPoint().getLatitude(), mc.getPoint().getLongitude());

                MapType mapType = null;
                //todo: use MapType factory here. (* create it first)
                if (mc.getMapType().equalsIgnoreCase("Hybrid")) mapType = MapType.getHybridMap();

                mw.setCenter(ll, mc.getZoom(), mapType);
            }
        });

        eventBus.addHandler(AddMarkerEvent.TYPE, new AddMarkerEventHandler() {
            public void onAddMarker(AddMarkerEvent event) {
                GWT.log("AddMarker event on position: " + event.getPosition().toString());

                MarkerOptions markerOptions = MarkerOptions.newInstance();
                markerOptions.setDraggable(true);
                Marker marker = new Marker(event.getPosition(), markerOptions);
                //marker.setDraggingEnabled(true);

                //GWT.log(new Boolean(marker.isDraggable()).toString());
                //GWT.log(String.valueOf(marker.isDraggingEnabled()));

                MapWidgetManager.getMapWidget().addOverlay(marker);
            }
        });

        injector.getMapConfigManager().retrieveMapConfig();
        injector.getMapPreloadManager().doPreload();
    }

    public void goTo(Place place) {
        injector.getAppPlaceController().goTo(place);
    }

    public String mayStop() {
        return null;
        //return "Please hold on. This activity is stopping.";
    }
}
