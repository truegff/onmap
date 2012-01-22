package ge.lanmaster.onmap.root.client.place.south;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class SouthGuestPlace extends Place {
    private String token;

    public SouthGuestPlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<SouthGuestPlace> {
        public SouthGuestPlace getPlace(String token) {
            return new SouthGuestPlace(token);
        }

        public String getToken(SouthGuestPlace place) {
            return place.getToken();
        }
    }
}
