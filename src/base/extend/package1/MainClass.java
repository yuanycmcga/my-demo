package base.extend.package1;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description MainClass
 * @create 2020/10/28 10:47
 */
public class MainClass {
    public static void main(String[] args) {
        BaseClass b1 = new BaseClass();
        System.out.println(b1.str);
        SubClass s1 = new SubClass();
        b1.protectedMethod(); // 父类的protected方法可在同一个包中的其它类中被访问
        s1.protectedMethod(); // 子类中继承了父类的protected方法
    }
}
