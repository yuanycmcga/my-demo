package base.extend.package1;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description BaseClass
 * @create 2020/10/28 10:46
 */
public class BaseClass {
    protected String str = "father";
    // protected方法
    protected void protectedMethod() {
        System.out.println("This is BaseClass: " + str);
    }
}
