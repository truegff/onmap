package ge.lanmaster.onmap.root.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import ge.lanmaster.onmap.root.client.activity.center.CenterBlankActivity;
import ge.lanmaster.onmap.root.client.place.center.CenterBlankPlace;
import ge.lanmaster.onmap.root.client.place.center.CenterGuestPlace;

@WithTokenizers({CenterBlankPlace.Tokenizer.class, CenterGuestPlace.Tokenizer.class})
public interface CenterPlaceHistoryMapper extends PlaceHistoryMapper{

}
