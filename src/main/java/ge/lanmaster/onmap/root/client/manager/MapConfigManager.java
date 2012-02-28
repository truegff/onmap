package ge.lanmaster.onmap.root.client.manager;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import ge.lanmaster.onmap.root.client.entity.MapConfig;
import ge.lanmaster.onmap.root.client.services.DataTransferServiceAsync;

public class MapConfigManager {

    @Inject
    DataTransferServiceAsync dataTransferService;

    private MapConfig mapConfig;

    public void retrieveMapConfig(final Command successCase, final Command failureCase) {

        try {
            dataTransferService.getUserMapConfig(
                    new AsyncCallback<MapConfig>() {
                        public void onFailure(Throwable caught) {
                            failureCase.execute();
                        }

                        public void onSuccess(MapConfig result) {
                            mapConfig = result;
                            successCase.execute();
                        }
                    }
            );
        } catch (Exception e) {
            failureCase.execute();
            GWT.log(e.getMessage());
        }
    }

    public MapConfig getMapConfig() {
        return mapConfig;
    }

    public void setMapConfig(MapConfig mapConfig) {
        this.mapConfig = mapConfig;
    }
}
