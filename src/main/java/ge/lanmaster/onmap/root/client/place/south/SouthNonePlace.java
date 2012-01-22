package ge.lanmaster.onmap.root.client.place.south;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class SouthNonePlace extends Place{
    private String token;

    public SouthNonePlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<SouthNonePlace> {
        public SouthNonePlace getPlace(String token) {
            return new SouthNonePlace(token);
        }

        public String getToken(SouthNonePlace place) {
            return place.getToken();
        }
    }
}
