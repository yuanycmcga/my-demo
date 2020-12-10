package concurrent;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description demo
 * @create 2020-09-07 10:32
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("线程"+Thread.currentThread()+"开始运行"+"===" + System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("线程"+Thread.currentThread()+"结束运行"+"===" + System.currentTimeMillis());
        //System.out.println("线程"+Thread.currentThread()+"结束运行");
    }
}
