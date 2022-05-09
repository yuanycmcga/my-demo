package concurrent.ticket;

import concurrent.pool.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description 测试线程池卖票
 * @create 2021/04/19 23:50
 */
public class ThreadPoolTicketTest {
    public static void main(String[] args) {

        ExecutorService pool = new ThreadPoolExecutor(5, 10, 0L,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));

        TicketRunnable ticketRunnable = new TicketRunnable();

        //获取开始时间
        long startTime=System.currentTimeMillis();

        for (int i = 0; i < 30; i++) {
            pool.submit(ticketRunnable);
            //new Thread(ticketRunnable).start();
        }

        //获取结束时间
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

    }
}
