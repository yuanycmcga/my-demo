package base.map;

import base.beans.Car;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description Map
 * @create 2021/01/28 10:50
 */
public class TestDemo {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1234L);
        map.put("name", "yuan");
        System.out.println(map.get("id"));
    }
    @Test
    public void test() {

        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        List<String> tasks = new ArrayList<>();
        tasks.add("task1");
        tasks.add("task2");
//        tasks.add("task3");
//        tasks.add("task4");
//        tasks.add("task5");

        Map<String, List<String>> stringListMap = allotOfAverage(users, tasks);


    }
    /*
     * 平均分配
     */
    public Map<String, List<String>> allotOfAverage(List<String> users, List<String> tasks) {
        Map<String, List<String>> allot = new ConcurrentHashMap<String, List<String>>(); //保存分配的信息
        if (users != null && users.size() > 0 && tasks != null && tasks.size() > 0) {
            for (int i = 0; i < tasks.size(); i++) {
                int j = i % users.size();
                if (allot.containsKey(users.get(j))) {
                    List<String> list = allot.get(users.get(j));
                    list.add(tasks.get(i));
                    allot.put(users.get(j), list);
                } else {
                    List<String> list = new ArrayList<String>();
                    list.add(tasks.get(i));
                    allot.put(users.get(j), list);
                }
            }
        }
        return allot;
    }
    @Test
    public void test1() {

        List<Car> users = new ArrayList<>();
        users.add(new Car("S600", "Benz", "轿车"));
        users.add(new Car("3系", "Bmw", "轿车"));
        users.add(new Car("卡罗拉", "TOYOTA", "轿车"));
        List<String> tasks = new ArrayList<>();
        tasks.add("task1");
        tasks.add("task2");
        tasks.add("task3");
        tasks.add("task4");
        tasks.add("task5");

        Map<Car, List<String>> stringListMap = allotOfAverageBean(users, tasks);


    }
    /*
     * 平均分配
     */
    public Map<Car, List<String>> allotOfAverageBean(List<Car> users, List<String> tasks) {
        Map<Car, List<String>> allot = new ConcurrentHashMap<Car, List<String>>(); //保存分配的信息
        if (users != null && users.size() > 0 && tasks != null && tasks.size() > 0) {
            for (int i = 0; i < tasks.size(); i++) {
                int j = i % users.size();
                if (allot.containsKey(users.get(j))) {
                    List<String> list = allot.get(users.get(j));
                    list.add(tasks.get(i));
                    allot.put(users.get(j), list);
                } else {
                    List<String> list = new ArrayList<String>();
                    list.add(tasks.get(i));
                    allot.put(users.get(j), list);
                }
            }
        }
        return allot;
    }
}

