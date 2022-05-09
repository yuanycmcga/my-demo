package pattern;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description TODO
 * @create 2021/03/30 16:35
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("==>发短信");
    }
}
