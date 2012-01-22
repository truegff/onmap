package ge.lanmaster.onmap.root.client.place.north;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class NorthBlankPlace extends Place{
    private String token;

    public NorthBlankPlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<NorthBlankPlace> {
        public NorthBlankPlace getPlace(String token) {
            return new NorthBlankPlace(token);
        }

        public String getToken(NorthBlankPlace place) {
            return place.getToken();
        }
    }
}
