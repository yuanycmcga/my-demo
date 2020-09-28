import java.time.Clock;
import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        String phoneTokenUrl = "https://openapi.dustess.com/oauth/token/getToken";
        long millis = Clock.systemDefaultZone().millis();

        String url = phoneTokenUrl + "?timestamp=" + millis;
        System.out.println(url);

        ArrayList<Object> objects = new ArrayList<>();
    }
}
