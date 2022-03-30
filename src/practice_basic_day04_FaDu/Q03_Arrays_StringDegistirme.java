package practice_basic_day04_FaDu;

import java.util.Arrays;

public class Q03_Arrays_StringDegistirme {

    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        String str = "HeySiri";
        String arr[] = str.split("");
        System.out.println("String str: "+str);
        System.out.println("Array str: "+Arrays.toString(arr));

        String str2 = "ByeSiri";
        System.out.println("String str2 : "+str2);
        String arr2[] = str2.split("");
        System.out.println("Array str2: "+Arrays.toString(arr2));

        // arr yi komple arr2 olarak degistiriyoruz, hem icerik hem de boyut oldugu gibi

        arr = arr2;

        System.out.println("Array str: "+Arrays.toString(arr));
    }

}

