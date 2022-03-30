package practice_basic_day02_FaDu;

import java.util.Scanner;

public class Q15_StringManipulation09 {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String kelime = scan.nextLine();

        if(kelime.length()%2==1) {
            System.out.println("Kelimenin orta harfi : "+kelime.substring(kelime.length()/2,kelime.length()/2+1));
        } else {
            System.out.println("Girilen kelime cift sayida karakter iceriyor");
        }


    }
}