package concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description TODO
 * @create 2021/03/02 17:41
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
        for (int i = 1; i <= 30; i++) {
            new Thread(() -> {
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString());
                System.out.println(Thread.currentThread().getName() + map);
            }, "Thread " + i).start();
        }
    }
}
