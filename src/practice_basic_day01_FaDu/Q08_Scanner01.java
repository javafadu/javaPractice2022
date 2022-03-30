package practice_basic_day01_FaDu;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter 2 integer numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Sayilarin toplami :" +num1+"+"+num2+"="+(num1+num2));
    }



}
