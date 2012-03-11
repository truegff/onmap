package ge.lanmaster.onmap.root.client.manager;

import com.google.gwt.maps.client.MapWidget;

public class MapWidgetManager {
    private static MapWidget mapWidget;

    public static void setMapWidget(MapWidget mapWidget) {
        MapWidgetManager.mapWidget = mapWidget;
    }

    public static MapWidget getMapWidget() {
        return mapWidget;
    }
}
