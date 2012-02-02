package ge.lanmaster.onmap.root.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import ge.lanmaster.onmap.root.client.entity.Car;

/**
 * Created by IntelliJ IDEA.
 * User: alexander
 * Date: 1/29/12
 * Time: 1:40 AM
 * Learning objectify.
 */
@RemoteServiceRelativePath("objectifyTest")
public interface ObjectifyTestService extends RemoteService {
    public Boolean saveCar(Car car);
}
