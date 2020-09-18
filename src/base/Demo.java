package base;

import org.junit.Test;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description Demo
 * @create 2020/09/18 11:44
 */
public class Demo {

    @Test
    public void test1() {
        String str = "1";
        String state = "connected".equals(str) ? "dealing" : "notDeal";
        System.out.println(state);
    }

}
