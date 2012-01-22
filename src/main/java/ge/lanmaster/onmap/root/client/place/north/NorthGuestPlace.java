package ge.lanmaster.onmap.root.client.place.north;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class NorthGuestPlace extends Place{
    private String token;

    /**
     * Constructor
     */
    public NorthGuestPlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<NorthGuestPlace> {

        public NorthGuestPlace getPlace(String token) {
            return new NorthGuestPlace(token);
        }

        public String getToken(NorthGuestPlace place) {
            return place.getToken();
        }
    }
}
