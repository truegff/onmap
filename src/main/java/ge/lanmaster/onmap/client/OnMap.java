package ge.lanmaster.onmap.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import ge.lanmaster.gwt.ui.widgets.client.ABC;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class OnMap implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        ABC abc = new ABC();
        Window.alert("I'm loaded " + ABC.className + " " + abc.one());

        MyUserServiceAsync service = (MyUserServiceAsync) GWT.create(MyUserService.class);
        ServiceDefTarget serviceDef = (ServiceDefTarget) service;
        serviceDef.setServiceEntryPoint(GWT.getModuleBaseURL()+"userService");
        service.sayHello(new AsyncCallback<String>() {

            public void onFailure(Throwable caught) {
                Window.alert("failure "+caught.getMessage());
                //throw new UnsupportedOperationException("Not supported yet.");
            }

            public void onSuccess(String result) {
                Window.alert(result);
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

}
