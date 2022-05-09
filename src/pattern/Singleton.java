package pattern;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description 单例模式 双检锁
 * @create 2021/03/30 18:00
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
