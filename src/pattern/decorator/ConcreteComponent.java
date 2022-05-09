package pattern.decorator;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description ConcreteComponent
 * @create 2021/05/09 22:45
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent------->operation");
    }
}
