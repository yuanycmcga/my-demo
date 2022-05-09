package concurrent;

import java.util.concurrent.*;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description Demo
 * @create 2020-09-07 14:31
 */
public class ThreadPoolExecutorDemo {
    private static BlockingQueue blockingQueue = new ArrayBlockingQueue<>(10);
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(10, 20, 0L,
                TimeUnit.MILLISECONDS, blockingQueue);
        //for (int i = 0; i < 30; i++) {
            pool.execute(new MyRunnable());
            //MyRunnable myRunnable = new MyRunnable();
            //myRunnable.run();
        //}
    }
}
