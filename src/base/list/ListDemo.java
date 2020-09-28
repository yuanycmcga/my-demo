package base.list;

import base.beans.Car;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

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
}
