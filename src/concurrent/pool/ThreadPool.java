package concurrent.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description 线程池
 * @create 2021/03/02 16:30
 */
public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        for(int i = 0; i < 6; i++) {
            es.submit(new Task(String.valueOf(i)));
        }
        es.shutdown();
    }

}

class Task implements Runnable {

    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start task " + name);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        System.out.println("end task " + name);
    }
}
