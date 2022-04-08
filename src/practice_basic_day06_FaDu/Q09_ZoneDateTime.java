package practice_basic_day06_FaDu;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q09_ZoneDateTime {
    // Baska ülke veya bolgelerin saat dilimine gore zamani alma
    // Newyork un saat dilimine gore saat ?
    public static void main(String[] args) {

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
        // String ifade onemli, hatasiz yazilmasi gerekiyor
        ZonedDateTime ztdLocal = ZonedDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("zdt = " + zdt.format(format)); // zdt = 04.04.2022 16:41
        System.out.println("zdtLocal = " + ztdLocal.format(format)); // zdtLocal = 04.04.2022 23:41

    }
}
