import java.time.Clock;

public class HelloWorld {
    public static void main(String[] args) {
        String phoneTokenUrl = "https://openapi.dustess.com/oauth/token/getToken";
        long millis = Clock.systemDefaultZone().millis();

        String url = phoneTokenUrl + "?timestamp=" + millis;
        System.out.println(url);
    }
}
