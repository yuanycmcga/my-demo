package concurrent;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description test
 * @create 2020-09-07 10:35
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

    }
}
