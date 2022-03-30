package practice_basic_day04_FaDu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArraysList_TekrarliSayilar {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Liste uzunlugunu giriniz : ");
        int uzunluk = scan.nextInt();

        List<Integer> sayilar = new ArrayList<>();
        List<Integer> distinctSayilar = new ArrayList<>();
        List<Integer> tekrarliSayilar = new ArrayList<>();

        for (int i = 0; i < uzunluk; i++) {
            System.out.print((i + 1) + ". sayiyi giriniz: ");
            sayilar.add(scan.nextInt());

        }

        System.out.println("Listedeki Sayilar : " + sayilar);

        for (int i = 0; i < sayilar.size(); i++) {
            if(!distinctSayilar.contains(sayilar.get(i))) {
                distinctSayilar.add(sayilar.get(i));
            }

            else {
                tekrarliSayilar.add(sayilar.get(i));
            }

        }



        System.out.println("Farkli Sayilar : " + distinctSayilar);
        System.out.println("Tekrarli Sayilar : " + tekrarliSayilar);

    }
}
