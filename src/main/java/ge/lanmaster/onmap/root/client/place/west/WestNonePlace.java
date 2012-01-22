package ge.lanmaster.onmap.root.client.place.west;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class WestNonePlace extends Place{
    private String token;

    public WestNonePlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<WestNonePlace> {
        public WestNonePlace getPlace(String token) {
            return new WestNonePlace(token);
        }

        public String getToken(WestNonePlace place) {
            return place.getToken();
        }
    }
}
