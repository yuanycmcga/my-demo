package concurrent.ticket;

import concurrent.ticket.Ticket;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description TODO
 * @create 2021/03/10 11:40
 */
public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        //获取开始时间
        long startTime=System.currentTimeMillis();

       /* for (int i = 0; i < 310000; i++) {
            ticket.sale();
        }*/

       /* new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "窗口1").start();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "窗口2").start();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "窗口3").start();*/

        //获取结束时间
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

    }
}
