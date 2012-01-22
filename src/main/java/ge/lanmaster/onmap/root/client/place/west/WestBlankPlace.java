package ge.lanmaster.onmap.root.client.place.west;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class WestBlankPlace extends Place{
    private String token;

    public WestBlankPlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<WestBlankPlace> {

        public WestBlankPlace getPlace(String token) {
            return new WestBlankPlace(token);
        }

        public String getToken(WestBlankPlace place) {
            return place.getToken();
        }
    }
}
