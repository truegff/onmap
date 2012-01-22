package ge.lanmaster.onmap.root.client.place.east;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class EastNonePlace extends Place{
    private String token;

    public EastNonePlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<EastNonePlace> {
        public EastNonePlace getPlace(String token) {
            return new EastNonePlace(token);
        }

        public String getToken(EastNonePlace place) {
            return place.getToken();
        }
    }
}
