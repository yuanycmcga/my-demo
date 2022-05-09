package pattern.proxy;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description Proxy
 * @create 2021/05/09 22:31
 */
public class Proxy implements Subject {

    private Subject subject;
    public Proxy(){
        //关系在编译时确定
        subject = new RealSubject();
    }

    @Override
    public void doAction() {
        System.out.println("Proxy----->代理开始");
        subject.doAction();
        System.out.println("Proxy----->代理结束");
    }
}
