package fanxing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description
 * @create 2020/10/27 17:14
 */
public class ObjectDemo {

    @Test
    public void test2() {
        Integer integer = test22222(123);

        String a2 = (String) test1111("String");
        System.out.println(a2);
    }

    public static <T> T test22222(T t) {
        List<T> list_object2 = new ArrayList<T>();
        list_object2.add(t);
        return t;
    }

    public static Object test1111(Object object) {
        List<Object> list_object = new ArrayList<Object>();
        list_object.add("hello");
        list_object.add(123);
        for (int i = 0; i < list_object.size(); i++) {
            String str = (String)(list_object.get(i));
        }
        return object;
    }
}
