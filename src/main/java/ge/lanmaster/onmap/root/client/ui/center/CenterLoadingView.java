package ge.lanmaster.onmap.root.client.ui.center;

import com.google.gwt.user.client.ui.IsWidget;

public interface CenterLoadingView extends IsWidget {
    void setName(String name);

    void setPresenter(CenterGuestView.Presenter presenter);
}
