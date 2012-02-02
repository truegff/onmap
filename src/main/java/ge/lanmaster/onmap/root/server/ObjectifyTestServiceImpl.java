package ge.lanmaster.onmap.root.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import ge.lanmaster.onmap.root.client.entity.Car;
import ge.lanmaster.onmap.root.client.services.ObjectifyTestService;

/**
 * Created by IntelliJ IDEA.
 * User: alexander
 * Date: 1/29/12
 * Time: 1:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class ObjectifyTestServiceImpl extends RemoteServiceServlet implements ObjectifyTestService {
    public Boolean saveCar(Car car) {

        //ObjectifyService.register(Car.class);
        Objectify ofy = ObjectifyService.begin();
        ofy.put(car);
        if (car.getVin().equals("vin")) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
