package practice_basic_day02_FaDu;

import java.util.Scanner;

public class Q04_SwitchCase02 {
    /*
     * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
     * ornek
     *  Kullanici  : A , B , C harflerinden birini secsin
         A'yi secmis ise, ==> Java is easy
         B'yi secmis ise, ==> Java is fun
         C'yi secmis ise, ==> I need to study :)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.print("A,B,C den birini giriniz : ");
            String harf = scan.next();
            String harfDuzelt = harf.toUpperCase();

            switch (harfDuzelt) {
                    case "A":
                            System.out.println("Secim : "+harfDuzelt+" -> Java is easy");
                            break;
                    case "B":
                            System.out.println("Secim : "+harfDuzelt+" -> Java is fun");
                            break;
                    case "C":
                            System.out.println("Secim : "+harfDuzelt+" -> I need to study");
                            break;
                    default:
                            System.out.println("Secim : "+harfDuzelt+" \nLutfen sadece A,B,C den birini giriniz");
            }


    }
}
