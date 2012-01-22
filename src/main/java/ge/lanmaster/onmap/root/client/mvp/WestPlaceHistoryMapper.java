package ge.lanmaster.onmap.root.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import ge.lanmaster.onmap.root.client.place.west.WestBlankPlace;
import ge.lanmaster.onmap.root.client.place.west.WestGuestPlace;
import ge.lanmaster.onmap.root.client.place.west.WestNonePlace;

@WithTokenizers({WestBlankPlace.Tokenizer.class, WestGuestPlace.Tokenizer.class, WestNonePlace.Tokenizer.class})
public interface WestPlaceHistoryMapper extends PlaceHistoryMapper{
}
