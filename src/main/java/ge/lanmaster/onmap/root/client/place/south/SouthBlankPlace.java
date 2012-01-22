package ge.lanmaster.onmap.root.client.place.south;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class SouthBlankPlace extends Place{
    private String token;

    public SouthBlankPlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<SouthBlankPlace> {
        public SouthBlankPlace getPlace(String token) {
            return new SouthBlankPlace(token);
        }

        public String getToken(SouthBlankPlace place) {
            return place.getToken();
        }
    }
}
