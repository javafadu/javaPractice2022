package practice_basic_day04_FaDu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11_ArraysList_usernameControl {

    static List<String> usernames = new ArrayList<>();

    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        // 1. adim
            /*
            kullanici adini alalim
            bosluklari silelim
             */

        // 2. adim
            /*
            burada
            kullanici adini kontrol edelim icerdekilerle ayni mi degil mi
             */

        // 3. adim


        // 4. adim


        // Sistemde mevcut username leri olusturalim
        usernames.add("deneme");
        usernames.add("salih");
        usernames.add("kamil");
        usernames.add("test");
        usernames.add("basaran");
        usernames.add("alex");
        usernames.add("souza");
        usernames.add("martin");
        usernames.add("mehmet");
        usernames.add("ahmet");
        usernames.add("adem");
        usernames.add("ali");


        // kullanicidan username girmesini isteyelim
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanici adini giriniz : ");
        String username = scan.nextLine();

        // kullanici adinda bosluk varsa silelim
        username = bosluklarisil(username);


        // kullanici adi daha once var mi yok mu bakalim
        username = usernameCheck(username);


    } // main sonu

    private static String usernameCheck(String username) {

        if (!usernames.contains(username)) {
            usernames.add(username);
            System.out.println("Kullanici adiniz " + username + " olarak sisteme kaydolmustur");

        } else {
            String newUsername = newUsernameCreate(username);
            usernameCheck(newUsername);
        }
        return username;
    } // usernameCheck son


    private static String newUsernameCreate(String username) {
        int r = (int) (Math.random() * (10 - 1)) + 1;
        username = username + r;
        System.out.println("Yazmis oldugunuz kullanici adi daha once kayitlidir");
        return username;
    } // newUsernameCreate son

    private static String bosluklarisil(String username) {
        username=username.trim();
        if(username.contains(" ")) {
        username = username.replace(" ", "");
        System.out.println("Kullanici adinizda bosluklar silindi");
        return username;
        } else {
            return username;
        }
    }// bosluklarisil son
}
