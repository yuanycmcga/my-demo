package lambda;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description TODO
 * @create 2021/01/27 15:38
 */
public class TestDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("启动线程");
            }
        }).start();

        new Thread(
                () -> System.out.println("启动线程lambda")
        ).start();
    }
}
