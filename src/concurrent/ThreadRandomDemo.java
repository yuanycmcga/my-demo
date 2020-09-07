package concurrent;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description test
 * @create 2020-09-07 10:53
 */
public class ThreadRandomDemo {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new RandomThread("RandomThread:" + i);
        }
        for (Thread thread : threads) {
            thread.start();
        }
    }
}

class RandomThread extends Thread {

    public RandomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}