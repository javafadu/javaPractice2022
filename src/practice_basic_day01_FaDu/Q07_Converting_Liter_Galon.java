package practice_basic_day01_FaDu;

import java.util.Scanner;

public class Q07_Converting_Liter_Galon {

   /*
   galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Litreye  donusturmek istediginiz \"galon\" degerini giriniz");
        double galon = scan.nextDouble();
        System.out.println("Galon :"+galon +"\nLitre:"+(galon*3.785));

        System.out.println("Galona  donusturmek istediginiz \"litre\" degerini giriniz");
        double litre = scan.nextDouble();
        System.out.println("Litre :"+litre +"\nGalon :"+(litre/3.785));



    }

}
