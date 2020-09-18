package dateutil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description Date
 * @create 2020/09/17 16:42
 */
public class DateDemo {
    public static void main(String[] args) {

        //格式化
        DateTimeFormatter fmTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //当前时间
        LocalDateTime now = LocalDateTime.now();
        String nowFormat = now.format(fmTime);
        System.out.println("当前时间:"+nowFormat);
        //1分钟前
        LocalDateTime before = LocalDateTime.now().minus(1, ChronoUnit.MINUTES);
        String beforeFormat = before.format(fmTime);
        System.out.println("1分钟前:"+beforeFormat);

    }
}
