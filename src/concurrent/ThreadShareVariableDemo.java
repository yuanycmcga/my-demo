package concurrent;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description test
 * @create 2020-09-07 11:01
 */
public class ThreadShareVariableDemo {
    public static void main(String[] args) {
        Runnable runnable = new ShareVariableRunnable();
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(runnable, "thread:" + (i + 1));
        }
        for (Thread thread : threads) {
            thread.start();
        }
    }
}

class ShareVariableRunnable implements Runnable {
    private int count = 5;

    public synchronized void run() {
        int temp = count--;
        System.out.println("" + Thread.currentThread().getName() + ",count:" + temp +  "===" + count);
    }
}