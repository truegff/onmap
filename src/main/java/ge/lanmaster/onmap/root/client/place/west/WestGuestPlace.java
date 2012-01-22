package ge.lanmaster.onmap.root.client.place.west;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class WestGuestPlace extends Place{
    private String token;

    public WestGuestPlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<WestGuestPlace> {

        public WestGuestPlace getPlace(String token) {
            return new WestGuestPlace(token);
        }

        public String getToken(WestGuestPlace place) {
            return place.getToken();
        }
    }
}
