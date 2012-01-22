package ge.lanmaster.onmap.root.client.ui.center;

import com.google.gwt.core.client.GWT;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.Maps;
import com.google.gwt.maps.client.control.LargeMapControl;
import com.google.gwt.maps.client.control.MenuMapTypeControl;
import com.google.gwt.maps.client.geom.LatLng;
import com.google.gwt.maps.client.overlay.Marker;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class CenterGuestViewImpl extends Composite implements CenterGuestView {

    private static CenterGuestViewImplUiBinder uiBinder = GWT.create(CenterGuestViewImplUiBinder.class);


    interface CenterGuestViewImplUiBinder extends UiBinder<Widget, CenterGuestViewImpl> {
    }

    private Presenter presenter;
    private String name;

    @UiField
    HTMLPanel map;

    public CenterGuestViewImpl() {
        initWidget((Widget) uiBinder.createAndBindUi(this));



        Maps.loadMapsApi("", "2", false, new Runnable() {
            public void run() {
                Window.alert("Maps loaded");

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

                //GWT.log(" ");

                mapWidget.addControl(new LargeMapControl());
                mapWidget.addControl(new MenuMapTypeControl());
                mapWidget.addOverlay(new Marker(latLng));
                mapWidget.checkResizeAndCenter();

                map.add(mapWidget.asWidget());
                //GWT.log(" ");
                //GWT.log("mapWidgetRelated tasks all done");
                //Window.alert(mapWidget.toString());
            }
        });

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
