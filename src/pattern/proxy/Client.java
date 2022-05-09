package pattern.proxy;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description Client
 * @create 2021/05/09 22:34
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.doAction();
    }
}
