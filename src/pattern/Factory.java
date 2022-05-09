package pattern;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description 工厂设计模式
 * @create 2021/03/30 16:32
 */
public class Factory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确类型");
            return null;
        }
    }
}
