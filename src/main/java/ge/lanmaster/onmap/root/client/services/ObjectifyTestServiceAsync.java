package ge.lanmaster.onmap.root.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import ge.lanmaster.onmap.root.client.entity.Car;

public interface ObjectifyTestServiceAsync {
    void saveCar(Car car, AsyncCallback<Boolean> async);
}
