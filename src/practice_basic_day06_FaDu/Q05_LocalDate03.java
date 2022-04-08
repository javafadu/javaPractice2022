package practice_basic_day06_FaDu;

import java.time.LocalDate;
import java.time.Month;

public class Q05_LocalDate03 {
    public static void main(String[] args) {

        /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */
        // LocalDate date = LocalDate.of(2018, Month.FEBRUARY, 29);

        // System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

        // cevap: Invalid date 'February 29' as '2018' is not a leap year
        // 2018 %4 != 0;

        System.out.println(LocalDate.of(2018,2,20).isLeapYear());
        // false


            /*
            A. 2018 APRIL 29
            B. 2018 APRIL 30
            C. 2018 MAY 10
            D. Another date.
            E. The code does not compile.
            F. A runtime exception is thrown.
            */

    }
}
