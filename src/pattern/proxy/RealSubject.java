package pattern.proxy;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description TODO
 * @create 2021/05/09 22:32
 */
public class RealSubject implements Subject {
    @Override
    public void doAction() {
        System.out.println("RealSubject------->doAction");
    }
}
