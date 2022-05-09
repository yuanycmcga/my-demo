package lambda;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description 函数式接口测试
 * @create 2021/03/10 10:39
 */
public class FunctionalTest {

    public static void main(String[] args) {
       /* IRun run = new IRun() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        };
        run.run();*/

        IRun run = () -> {
            System.out.println("lambda匿名内部类");
        };
        run.run();
    }


}

interface IRun {
    abstract void run();
}

class Run implements IRun {
    @Override
    public void run() {
        System.out.println("Run..........");
    }
}
