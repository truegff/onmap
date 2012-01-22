package ge.lanmaster.onmap.root.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class GoodbyePlace extends Place{
    private String goodbyeName;

    public GoodbyePlace(String token) {
        this.goodbyeName = token;
    }

    public String getGoodbyeName() {
        return goodbyeName;
    }

    public static class Tokenizer implements PlaceTokenizer<GoodbyePlace> {

        public GoodbyePlace getPlace(String token) {
            return new GoodbyePlace(token);
        }

        public String getToken(GoodbyePlace place) {
            return place.getGoodbyeName();
        }
    }
}
