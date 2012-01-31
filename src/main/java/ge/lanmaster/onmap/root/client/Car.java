package ge.lanmaster.onmap.root.client;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.googlecode.objectify.annotation.Entity;

import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Created by IntelliJ IDEA.
 * User: alexander
 * Date: 1/29/12
 * Time: 1:06 AM
 * Learning objectify.
 */

@Entity
public class Car implements IsSerializable {
    @Id Long id;
    String vin;
    int color;

    @Transient String doNotPersist;

    private Car () {}

    public Car (String vin, int color){
        this.vin = vin;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getDoNotPersist() {
        return doNotPersist;
    }

    public void setDoNotPersist(String doNotPersist) {
        this.doNotPersist = doNotPersist;
    }
}
