package base;

import org.junit.Test;

import java.util.Random;
import java.util.zip.DeflaterOutputStream;

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
    @Test
    public void test2() {
        Integer a = 1000, b = 1000;
        System.out.println(a == b);//1
        Integer c = 128, d = 128;
        System.out.println(c.equals(d));//2
    }

    @Test
    public void test3() {
        String str = null;
        int num = 0;
        System.out.println(str);
        System.out.println(num);

        double dou = 99.99;
        double resp = 10.25 / 100;
        System.out.println(resp);
    }
    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            System.out.println(rand.nextInt(70)+30);
        }
    }

}
