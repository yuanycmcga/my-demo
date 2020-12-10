import org.junit.Test;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        String phoneTokenUrl = "https://openapi.dustess.com/oauth/token/getToken";
        long millis = Clock.systemDefaultZone().millis();

        String url = phoneTokenUrl + "?timestamp=" + millis;
        System.out.println(millis);

    }

    @Test
    public void test() {
      /*  String str = "selfline,directline,nodirectline";
        getSql(str);*/
        String str = "hello";
        System.out.println(str.substring(1, 5));
    }

    @Test
    public void test1() {
        String sql = null;
        sql += " and pc.regulate_status='on' ";
        System.out.println(sql);
    }

    public void getSql(String relationShips) {
       /* String[] ships = relationShips.split(",");
        boolean hasSelfline = false;
        boolean hasDirectline = false;
        boolean hasNodirectline = false;
        for (int i = 0; i < ships.length; i++) {
            if ("selfline".equals(ships[i])) {// 本人
                hasSelfline = true;
            }
            if ("directline".equals(ships[i])) {// 直系
                hasDirectline = true;
            } else if ("nodirectline".equals(ships[i])) {// 非直系
                hasNodirectline = true;
            }
        }*/

        List<String> sqlList = new ArrayList<>();
        sqlList.add("(pct.relation = 9)");

       /* if (hasSelfline) {
            sqlList.add("(pct.relation = 1)");
        }

        if (hasDirectline && !hasSelfline) {

            sqlList.add("(pct.relation = 2)");

        } else if (hasDirectline && hasSelfline) {

            sqlList.add("pct.relation in (1,2)");
        }

        if (hasNodirectline) {
            sqlList.add("pct.relation = 3");
        }*/

        String sqlStr = String.join(" OR ", sqlList);

        if (sqlStr != null) {
            sqlStr = " AND (" + sqlStr + ")";
        }
        System.out.println(sqlStr);
    }
}
