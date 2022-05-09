package pattern.decorator;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description Client
 * @create 2021/05/09 22:46
 */
public class Client {
    public static void main(String[] args) {
        //客户指定了装饰者需要装饰的是哪一个类
        Component component = new Decorator(new ConcreteComponent());
        component.operation();
    }
}
