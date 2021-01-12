package fanxing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description 泛型测试
 * @create 2020/12/10 15:37
 */
public class TestDemo {
    public void test(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }

    }
    @Test
    public void demo() {
        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        test(strList);
        Object o = new Object();

    }

}

