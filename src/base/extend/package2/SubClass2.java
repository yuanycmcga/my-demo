package base.extend.package2;

import base.extend.package1.BaseClass;
import org.junit.Test;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description SubClass2
 * @create 2020/10/28 10:51
 */
public class SubClass2 extends BaseClass {
    @Test
    public void testMesthod(){
        BaseClass b1 = new BaseClass();
        //b1.protectedMethod(); // 编译器报错。父类的protected方法不可以在不同一个包中的子类中被访问
        this.protectedMethod(); // 子类继承了父类protected方法
        System.out.println(this.str);
    }
}
