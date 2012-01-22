package ge.lanmaster.onmap.root.client.place.center;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class CenterGuestPlace extends Place {
    private String token;

    public CenterGuestPlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<CenterGuestPlace>{
        public CenterGuestPlace getPlace(String token) {
            return new CenterGuestPlace(token);
        }

        public String getToken(CenterGuestPlace place) {
            return place.getToken();
        }
    }
}
