package practice_basic_day02_FaDu;

import java.util.Scanner;

public class Q03_SwitchCase01 {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir gun adi yaziniz : ");
        String gunGirilen = scan.next();
        String gunStandart = gunGirilen.toLowerCase();

        switch (gunStandart) {
            case "pazartesi":
            case "sali":
                System.out.println("Java Dersi Gunleri");
                break;

            case "persembe":
            case "cuma":
                System.out.println("Selenyum Dersi Gunleri");
                break;

            case "carsamba":
            case "cumartesi":
                System.out.println("SQL Dersi Gunleri");
                break;

            case "pazar":
                System.out.println("izin gunu");
                break;
            default:
                System.out.println("Lutfen gun ismini dogru ve ingilizce karakter olarak giriniz");

        }


    }
}
