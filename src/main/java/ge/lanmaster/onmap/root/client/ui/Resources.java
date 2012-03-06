package ge.lanmaster.onmap.root.client.ui;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

/**
 * Resources used by the entire application.
 */
public interface Resources extends ClientBundle {
    @Source("css/gwt-main.css")
    Style style();

    @Source("img/loading.gif")
    ImageResource loading();
}