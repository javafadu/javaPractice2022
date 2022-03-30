package practice_basic_day04_FaDu;

import java.util.Arrays;
import java.util.Scanner;

public class Q10_Arrays_KarakterSayisi {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cumle giriniz : ");
        String str = scan.nextLine();

        // String i array lere atalim, her karakteri ayri ayri
        String[] arr = str.split("");

        // String i her karakteri 1 kez yazacak sekilde kisa halini bulalim
        String strKisa = "";
        for (int i = 0; i < arr.length; i++) {
            if (!strKisa.contains(arr[i]) && !arr[i].equals(" ")) {
                strKisa += arr[i];
            }
        }
        System.out.println(strKisa);

        // simdi de karakterlerin kacar kere kullanildigini bulalaim

// kisaltilmis String i Array e donusturelim
        String[] arrKisa = strKisa.split("");


        // Kisa Array ile Normal Array i karsilastirip, kisa array icindeki karakterlerin
        // normal Array icinde kac tane oldugunu sayacla bulalim.

        int sayac=0;
        for (int i = 0; i < arrKisa.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j].equals(arrKisa[i])) {
                    sayac++;
                }
                // kisa array deki karakterleri : karakter=adet seklinde yeniden atayalim
            } arrKisa[i]=arrKisa[i]+"="+sayac;
            // Kisa arrayden aldigimiz her karakteri kontrol ettikten sonra (j dongusu sonunda)
            // sifirlayalim
            sayac=0;

        }

        System.out.println(Arrays.toString(arrKisa));



    }
    }
