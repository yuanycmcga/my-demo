package concurrent.ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description TicketRunnable
 * @create 2021/04/19 23:58
 */
public class TicketRunnable implements Runnable {

    private int number = 30;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        //加锁
        lock.lock();
        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + number);
                number--;
            } else {
                System.out.println("票卖完了");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
