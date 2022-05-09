package concurrent;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description TODO
 * @create 2021/03/31 15:59
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //List<String> arrayList = Collections.synchronizedList(new ArrayList<>());
        List<String> arrayList = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                arrayList.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(Thread.currentThread().getName() + arrayList);
            }, "Thread" + i).start();
        }

    }
}
