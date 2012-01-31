package ge.lanmaster.onmap.root.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.rpc.AsyncCallback;
import ge.lanmaster.onmap.root.client.services.ObjectifyTestService;
import ge.lanmaster.onmap.root.client.services.ObjectifyTestServiceAsync;

/**
 * Created by IntelliJ IDEA.
 * User: alexander
 * Date: 1/29/12
 * Time: 2:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class DataManager {
    public void trySaveCar(Car car, final Command failureCase, final Command successCase){
        ObjectifyTestServiceAsync otsa = GWT.create(ObjectifyTestService.class);
        GWT.log("GWT.getHostPageBaseURL() = "+GWT.getHostPageBaseURL());
        try {
            otsa.saveCar(car, new AsyncCallback<Boolean>() {
                public void onFailure(Throwable caught) {
                    failureCase.execute();
                }

                public void onSuccess(Boolean result)
   {                //Window.alert("trySaveCar success"+result.toString());
                    successCase.execute();
                }
            });
        } catch (Exception e) {
            failureCase.execute();
        }
    }
}
