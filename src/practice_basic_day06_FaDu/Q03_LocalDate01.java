package practice_basic_day06_FaDu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q03_LocalDate01 {
    public static void main(String[] args) {
    //    String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
    //    System.out.println(date);  An exception is throw at runtime
        //what is the result ?

        String date2 = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date2);  // 2022-04-04T22:26:39.316442


        // Cevap:
        // Local Date : gunler icindir
        // LocalDateTime : zaman i gosterir saat, dakika, saniye olmasi lazim


        /*
         * A) May 04, 2014T00:00:00:000
         *
         * B) 2014-05-04T00:00:00:000
         *
         * C) 5/4/14T00:00:00:000
         *
         * D) An exception is throw at runtime
         */
    }
}
