package ge.lanmaster.onmap.root.client.entity;

import com.google.appengine.api.datastore.GeoPt;
import com.google.gwt.user.client.rpc.IsSerializable;

import javax.persistence.Id;

public class MapConfig implements IsSerializable {
    @Id
    private String id;
    private GeoPt point;
    private Integer zoom;
    private String mapType;

    public MapConfig(String id, GeoPt point, Integer zoom, String mapType) {
        this.id = id;
        this.point = point;
        this.zoom = zoom;
        this.mapType = mapType;
    }

    public MapConfig() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GeoPt getPoint() {
        return point;
    }

    public void setPoint(GeoPt point) {
        this.point = point;
    }

    public Integer getZoom() {
        return zoom;
    }

    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    public String getMapType() {
        return mapType;
    }

    public void setMapType(String mapType) {
        this.mapType = mapType;
    }
}
