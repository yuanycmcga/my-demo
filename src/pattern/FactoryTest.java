package pattern;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description FactoryTest
 * @create 2021/03/30 16:39
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Sender sms = factory.produce("sms");
        sms.send();
        Sender mail = factory.produce("mail");
        mail.send();
    }
}
