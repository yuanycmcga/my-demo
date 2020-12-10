package base.extend.package2;

import base.extend.package1.BaseClass;
import base.extend.package1.SubClass;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description MainClass2
 * @create 2020/10/28 10:56
 */
public class MainClass2 {
    public static void main(String[] args) {
        BaseClass b1 = new BaseClass();
        //b1.protectedMethod(); // 编译器报错。父类的protected方法不可以在不同一个包中的其它类中被访问
        SubClass2 s2 = new SubClass2();
        //s2.protectedMethod(); // 编译器报错。子类的protected方法不可以在不同一个包中的其它类中被访问
    }

}
