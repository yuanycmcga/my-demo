package concurrent;

import java.util.concurrent.*;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description Demo
 * @create 2020-09-07 14:31
 */
public class ThreadPoolExecutorDemo {
    private static BlockingQueue blockingQueue = new ArrayBlockingQueue<>(50);
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(50, 100, 60,
                TimeUnit.SECONDS, blockingQueue);
        for (int i = 0; i < 100; i++) {
            pool.execute(new MyRunnable());
        }
    }
}
