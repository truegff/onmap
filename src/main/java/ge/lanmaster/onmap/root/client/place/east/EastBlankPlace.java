package ge.lanmaster.onmap.root.client.place.east;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class EastBlankPlace extends Place {
    private String token;

    public EastBlankPlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<EastBlankPlace> {
        public EastBlankPlace getPlace(String token) {
            return new EastBlankPlace(token);
        }

        public String getToken(EastBlankPlace place) {
            return place.getToken();
        }
    }
}
