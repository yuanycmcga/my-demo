package base.extend.package1;

import org.junit.Test;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description SubClass
 * @create 2020/10/28 10:47
 */
public class SubClass extends BaseClass {
    @Test
    public void testMesthod(){
        BaseClass b1 = new BaseClass();
        b1.protectedMethod();
        System.out.println(b1.str);
    }
}
