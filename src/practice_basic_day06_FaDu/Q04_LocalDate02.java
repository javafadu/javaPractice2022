package practice_basic_day06_FaDu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q04_LocalDate02 {
    public static void main(String[] args) {

        /*
           Which of the following can be inserted into the blank to create a date of June 21, 2014?
           21 Haziran 2014 tarihini olusturmak için bos bırakılan yere asagidakilerden hangisi veya hangileri getirilebilir?
           A. new LocalDate(2014, 5, 21);
           B. new LocalDate(2014, 6, 21);
           C. LocalDate.of(2014, 5, 21);
           D. LocalDate.of(2014, 6, 21);
           F. LocalDate.of(2014, Month.JUNE, 21);
         */

        LocalDate date = LocalDate.of(2014,06,21);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
        System.out.println(formatter.format(date));  // June 21, 2014

        System.out.println(date); // 2014-06-21


    }
}
