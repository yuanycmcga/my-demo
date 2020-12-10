package concurrent;

import java.util.concurrent.*;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description Demo
 * @create 2020-09-07 14:31
 */
public class ThreadPoolExecutorDemo {
    private static BlockingQueue blockingQueue = new ArrayBlockingQueue<>(70);
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(10, 20, 0L,
                TimeUnit.MILLISECONDS, blockingQueue);
        for (int i = 0; i < 100; i++) {
            pool.execute(new MyRunnable());
        }
    }
}
