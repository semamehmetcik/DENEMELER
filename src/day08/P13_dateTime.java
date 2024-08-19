package day05;

import java.time.LocalTime;
import java.util.Locale;

public class P13_dateTime {
    public static void main(String[] args) {

        LocalTime bugun = LocalTime.now();
        System.out.println(bugun.getHour()+" / "+bugun.getMinute()+" / "+bugun.getSecond());

        System.out.println(bugun);
    }
}
