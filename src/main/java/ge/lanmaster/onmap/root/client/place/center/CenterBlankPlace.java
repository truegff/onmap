package ge.lanmaster.onmap.root.client.place.center;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class CenterBlankPlace extends Place{
    private String token;

    public CenterBlankPlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<CenterBlankPlace> {
        public CenterBlankPlace getPlace(String token) {
            return new CenterBlankPlace(token);
        }

        public String getToken(CenterBlankPlace place) {
            return place.getToken();
        }
    }
}
