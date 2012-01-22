package ge.lanmaster.onmap.root.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import ge.lanmaster.onmap.root.client.place.south.SouthBlankPlace;
import ge.lanmaster.onmap.root.client.place.south.SouthGuestPlace;
import ge.lanmaster.onmap.root.client.place.south.SouthNonePlace;

@WithTokenizers({SouthBlankPlace.Tokenizer.class, SouthGuestPlace.Tokenizer.class, SouthNonePlace.Tokenizer.class})
public interface SouthPlaceHistoryMapper extends PlaceHistoryMapper{
}
