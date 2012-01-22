package ge.lanmaster.onmap.root.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import ge.lanmaster.onmap.root.client.place.north.NorthBlankPlace;
import ge.lanmaster.onmap.root.client.place.north.NorthGuestPlace;
import ge.lanmaster.onmap.root.client.place.north.NorthNonePlace;

@WithTokenizers({NorthBlankPlace.Tokenizer.class, NorthGuestPlace.Tokenizer.class, NorthNonePlace.Tokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper{
}
