package practice_basic_day04_FaDu;

import java.util.Arrays;
import java.util.Scanner;

public class Q13_ArraysList_MaxNumbers {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        int arr[] = {1,2,3,14,5,6,7,8,12,21,33};
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac tane Max Deger Almak istiyorsunuz : ");
        int maxNum = scan.nextInt();

        int k = 1;

        Arrays.sort(arr);
        while (k<=maxNum) {
            System.out.print(arr[arr.length-k]+" ");
            k++;
        }



    }

}
