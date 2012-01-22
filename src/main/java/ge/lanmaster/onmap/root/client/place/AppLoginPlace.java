package ge.lanmaster.onmap.root.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class AppLoginPlace extends Place{
    private String token;

    public AppLoginPlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<AppLoginPlace> {

        public AppLoginPlace getPlace(String token) {
            return new AppLoginPlace(token);
        }

        public String getToken(AppLoginPlace place) {
            return place.getToken();
        }
    }
}
