package ge.lanmaster.onmap.root.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * Created by IntelliJ IDEA.
 * User: alexander
 * Date: 1/12/12
 * Time: 5:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class AppClientPlace extends Place {
    private String token;

    public AppClientPlace(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static class Tokenizer implements PlaceTokenizer<AppClientPlace> {

        public AppClientPlace getPlace(String token) {
            return new AppClientPlace(token);
        }

        public String getToken(AppClientPlace place) {
            return place.getToken();
        }
    }
}
