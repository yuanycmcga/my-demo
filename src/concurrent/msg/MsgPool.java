package concurrent.msg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MsgPool {
    public static void main(String[] args) {

        ExecutorService pool = new ThreadPoolExecutor(2, 5, 0L,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(30));

        List<String> list = new ArrayList<>();
        list.add("13112345671");
        list.add("13112345672");
        list.add("13112345673");
        list.add("13112345674");
        list.add("13112345675");
        list.add("13112345676");
        list.add("13112345677");
        list.add("13112345678");
        list.add("13112345679");
        list.add("13212345671");
        list.add("13212345672");
        list.add("13212345673");
        list.add("13212345674");
        list.add("13212345675");
        list.add("13212345676");
        list.add("13212345677");
        list.add("13212345678");
        list.add("13212345679");
        list.add("13312345671");
        list.add("13312345672");
        list.add("13312345673");
        list.add("13312345674");
        list.add("13312345675");
        list.add("13312345676");
        list.add("13312345677");
        list.add("13312345678");
        list.add("13312345679");
        list.add("13512345671");
        list.add("13512345672");
        list.add("13512345673");
        list.add("13512345674");
        list.add("13512345675");
        list.add("13512345676");
        list.add("13512345677");
        list.add("13512345678");
        list.add("13512345679");

        for (String mobile : list) {
            SendMsgTask sendMsgTask = new SendMsgTask(mobile);
            pool.submit(sendMsgTask);
        }

    }
}
