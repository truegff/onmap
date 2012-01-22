package ge.lanmaster.onmap.root.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import ge.lanmaster.onmap.root.client.place.east.EastBlankPlace;
import ge.lanmaster.onmap.root.client.place.east.EastGuestPlace;
import ge.lanmaster.onmap.root.client.place.east.EastNonePlace;

@WithTokenizers({EastBlankPlace.Tokenizer.class, EastGuestPlace.Tokenizer.class, EastNonePlace.Tokenizer.class})
public interface EastPlaceHistoryMapper extends PlaceHistoryMapper{

}
