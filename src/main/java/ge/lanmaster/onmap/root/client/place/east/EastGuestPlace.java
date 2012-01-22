package ge.lanmaster.onmap.root.client.place.east;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class EastGuestPlace extends Place{
    private String token;

    public EastGuestPlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<EastGuestPlace> {
        public EastGuestPlace getPlace(String token) {
            return new EastGuestPlace(token);
        }

        public String getToken(EastGuestPlace place) {
            return place.getToken();
        }
    }
}
