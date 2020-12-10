package dateutil;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @author chenyuanyuan
 * @company Sunline
 * @description Date
 * @create 2020/09/17 16:42
 */
public class DateDemo {
    public static void main(String[] args) {

        /*//格式化
        DateTimeFormatter fmTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //当前时间
        LocalDate now = LocalDate.now();
        //String nowFormat = now.format(fmTime);
        System.out.println("当前时间:"+now);
        //1分钟前
        LocalDateTime before = LocalDateTime.now().minus(5, ChronoUnit.HOURS);
        String beforeFormat = before.format(fmTime);
        System.out.println("1分钟前:"+beforeFormat);


        long millis = Clock.systemDefaultZone().millis();
        System.out.println(millis);

        Date date = new Date(1602743208);
        System.out.println(date);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Long temp = 1602743208 * 1000L;
        System.out.println(temp);
        String sd = sdf.format(new Date(1602743208000L));      // 时间戳转换成时间
        System.out.println("格式化结果：" + sd);*/

        System.out.println(LocalDate.now().getYear());
        System.out.println(LocalDate.now().getMonthValue());
        System.out.println(LocalDate.now().getDayOfMonth());

    }
}
