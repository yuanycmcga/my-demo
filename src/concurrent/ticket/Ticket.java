package concurrent.ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description 卖票案例
 * @create 2021/03/10 11:37
 */
public class Ticket {
    private int number = 300000;
    Lock lock = new ReentrantLock();
    public void sale() {
        //加锁
        lock.lock();
        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + number);
                number--;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
