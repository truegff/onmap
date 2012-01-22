package ge.lanmaster.onmap.root.client.place.north;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class NorthNonePlace extends Place {
    private String token;

    public NorthNonePlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<NorthNonePlace> {
        public NorthNonePlace getPlace(String token) {
            return new NorthNonePlace(token);
        }

        public String getToken(NorthNonePlace place) {
            return place.getToken();
        }
    }
}
