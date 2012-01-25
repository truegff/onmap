package ge.lanmaster.onmap.root.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class AppGuestPlace extends Place {
    private String token;

    public AppGuestPlace(String name) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<AppGuestPlace> {
        public AppGuestPlace getPlace(String token) {
            return new AppGuestPlace(token);
        }

        public String getToken(AppGuestPlace place) {
            return place.getToken();
        }
    }
}
