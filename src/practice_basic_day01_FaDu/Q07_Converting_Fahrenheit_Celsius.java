package practice_basic_day01_FaDu;

import java.util.Scanner;

public class Q07_Converting_Fahrenheit_Celsius {
     /*
        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */
     public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);
         System.out.println("Celsius a donusturmek istediginiz \"fahrenheit\" degerini giriniz");
         double temp = scan.nextDouble();
         System.out.println("Fahrenheit :"+temp +"\nCelsius :"+(temp-32)*5/9);


     }
}
