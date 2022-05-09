package base.list;

import base.beans.Car;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description TODO
 * @create 2020/09/23 15:21
 */
public class ListDemo {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        ArrayList<Integer> listInt = new ArrayList<>();
       /* for (String str : list) {
            System.out.println("111");
        }*/
        listInt.stream().forEach(str -> {
                    str = 1;
                    list.add(str);
                    str = 23;
                }
        );

        for (Integer str1 : list) {
            System.out.println(str1);
        }
    }

    @Test
    public void test() {
        List<Car> carList = new ArrayList<>();
        Car benchi = new Car();
        benchi.setName("S600");
        benchi.setBrand("奔驰");
        benchi.setType("轿车");

        Car bmw = new Car();
        bmw.setName("X7");
        bmw.setBrand("宝马");
        bmw.setType("SUV");

        carList.add(benchi);
        carList.add(bmw);
        List<Car> tempList = new ArrayList<>();
        for (Car car : carList) {
            tempList.add(car);
            car.setName("new");
        }
        for (Car car : tempList) {
            System.out.println(car.getName());
        }
    }

    @Test
    public void test1() {
        List<String> words = Arrays.asList("a", "b", "b", "c", "c", "d");
        words.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

        String source = "0,1,100,1000";

        String[] sourceArray = source.split(",");
        for (int i = 0; i < sourceArray.length; i++) {
            System.out.println(sourceArray[i]);
        }
    }

    @Test
    public void test2() {
        String s = null;
        Car car = new Car();
        car.setName(s);

        int[] array = {1, 2, 3};
        List<Integer> resultList =  Arrays.stream(array).boxed().collect(Collectors.toList());
        resultList.forEach(System.out::println);
    }

    /**
     * String -> Long
     */
    @Test
    public void test3() {
        String strs = "1,2,3";
        String[] array = strs.split(",");
        List<Long> idList = new ArrayList<>();
        for (String str: array) {
            Long aLong = Long.valueOf(str);
            System.out.println(aLong);

            idList.add(aLong);
        }
        idList.forEach(System.out::println);

    }
    @Test
    public void test4() {
        String filePath = "/a//b";
        int index = filePath.lastIndexOf("/");
        System.out.println(filePath.substring(index + 1));
    }

    @Test
    public void test5() {
        String type = "jpg";
        if ("bmp,jpg,png".contains(type)) {
            System.out.println(type);
        }
        long lon = 2086L;
        String resp = String.format("%.2f", (float) lon / 1024) + "KB";
        System.out.println(resp);
    }
}
