package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo {

    public static int modifyTheValue(int valueToBeOperated, Function<Integer, Integer> function) {
        return function.apply(valueToBeOperated);
    }

    public static void modifyTheValue3(int value, Consumer<Integer> consumer) {
        consumer.accept(value);
    }

    public static boolean predicateTest(int value, Predicate<Integer> predicate) {
        return predicate.test(value);
    }

    public static String supplierTest(Supplier<String> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        int myNumber = 10;

        // 使用lambda表达式实现函数式接口
        // (x)->(x)+20 输入一个参数x，进行加法运算，返回一个结果
        // 所以该lambda表达式可以实现Function接口
        int res1 = modifyTheValue(myNumber, (x)-> x + 20);
        System.out.println(res1); // 30

        modifyTheValue3(2, x -> System.out.println(x * 2));

        System.out.println(predicateTest(2, x -> x == 2));

        String name = "hhh";

        System.out.println(supplierTest(() -> name.length() + ""));
    }
}
