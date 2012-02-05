package ge.lanmaster.onmap.root.client.manager;

import com.google.gwt.user.client.Command;
import ge.lanmaster.onmap.root.client.entity.MapConfig;

public class MapConfigManager {
    private MapConfig mapConfig;

    public void retrieveMapConfig(Command successCase, Command failureCase) {
//        LoginServiceAsync loginService = GWT.create(LoginService.class);
//        GWT.log("GWT.getHostPageBaseURL() = " + GWT.getHostPageBaseURL());
//        try {
//            loginService.login(GWT.getHostPageBaseURL(), new AsyncCallback<UserState>()  {
//                public void onFailure(Throwable caught) {
//                    failureCase.execute();
//                }
//                public void onSuccess(UserState result) {
//                    userState = result;
//                    successCase.execute();
//                }
//            });
//        } catch (Exception e) {
//            failureCase.execute();
//            GWT.log(e.getMessage());
//        }
    }

    public MapConfig getMapConfig() {
        return mapConfig;
    }

    public void setMapConfig(MapConfig mapConfig) {
        this.mapConfig = mapConfig;
    }
}
