package pattern.decorator;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description Decorator
 * @create 2021/05/09 22:40
 */
public class Decorator implements Component {

    private Component component;
    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("Decorator------>装饰开始");
        component.operation();
        System.out.println("Decorator------>装饰结束");
    }
}
