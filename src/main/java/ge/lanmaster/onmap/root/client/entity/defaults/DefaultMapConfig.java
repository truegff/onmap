package ge.lanmaster.onmap.root.client.entity.defaults;

import com.google.appengine.api.datastore.GeoPt;
import ge.lanmaster.onmap.root.client.entity.MapConfig;

public class DefaultMapConfig extends MapConfig {

    private static Float tbsLat = new Float(41.722);
    private static Float tbsLong = new Float(44.777);
    private static GeoPt tbilisi = new GeoPt(tbsLat, tbsLong);

    public DefaultMapConfig(String id, GeoPt point, Integer zoom, String mapType) {
        super(id, point, zoom, mapType);
    }

    public DefaultMapConfig() {
        this("default", tbilisi, 13, "Hybrid");
    }
}
