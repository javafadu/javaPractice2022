package practice_basic_day06_FaDu;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Q07_LocalDate05 {
    public static void main(String[] args) {

       /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        Period p = Period.ofDays(1).ofYears(2);
        // Period Class dan p objemiz var
        // en son hangisi eklendi ise sadece o gecerlidir
        // (Period da en sagda ne varsa sadece o alinir.)
        // yani 2 yil alinacak
        // ofDays(1) iptal oldu


        d = d.minus(p); // period dan aldigimiz 2 yil, d de belirtilen tarihten geri gider
        // 2015 -2 = 2013 olur
        // assign oldugu icin tarih degisir

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        // SHORT sn yi almadan yazidiyor

        System.out.println(d.format(f));  // 5/10/13, 11:22 AM

 /*
            A. 5/9/13 11:22
            B. 5/10/13 11:22
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.
*/

    }
}
