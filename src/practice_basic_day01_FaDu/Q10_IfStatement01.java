package practice_basic_day01_FaDu;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter Y or N");
        char text = scan.next().toUpperCase().charAt(0);

        if(text=='Y') {
            System.out.println("OUTPUT : YES");
        }
        else if (text=='N') {
            System.out.println("OUTPUT : NO");
        }
        else {
            System.out.println("Wrong INPUT, please enter Y or N");
        }

    }

}
