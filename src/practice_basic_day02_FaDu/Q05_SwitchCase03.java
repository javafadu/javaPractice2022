package practice_basic_day02_FaDu;

import java.util.Scanner;

public class Q05_SwitchCase03 {

    // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int onlarBasamagi = (sayi/10)%10;

        if(sayi<10) {
            System.out.println("Lutfen en az iki basamakli pozitif bir sayi giriniz");
        } else {
            switch (onlarBasamagi) {
                case 0:
                    System.out.println("Sifir");
                    break;
                case 1:
                    System.out.println("Bir");
                    break;
                case 2:
                    System.out.println("Iki");
                    break;
                case 3:
                    System.out.println("Uc");
                    break;
                case 4:
                    System.out.println("Dort");
                    break;
                case 5:
                    System.out.println("Bes");
                    break;
                case 6:
                    System.out.println("Alti");
                    break;
                case 7:
                    System.out.println("Yedi");
                    break;
                case 8:
                    System.out.println("Sekiz");
                    break;
                case 9:
                    System.out.println("Dokuz");
                    break;
                default:
                    System.out.println("System Error");

            }

        }

    }
}
