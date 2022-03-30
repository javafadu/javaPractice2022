package practice_basic_day02_FaDu;

public class Q16_StringManipulation10 {

    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {

        String str = "   Java ogrenmek123 Cok guzel@     ";
        System.out.println(str);
        str = str.trim();
        System.out.println(str);
        String str0 = str.substring(0, 1) + str.substring(1).toLowerCase();
        System.out.println(str0);
        String str1 = str0.replaceAll("\\d", "");
        System.out.println(str1);
        String str2 = str1.replace("@", "");
        System.out.println(str2);


    }
}
