package pattern;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description TODO
 * @create 2021/03/30 16:34
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("==>发邮件");
    }
}
