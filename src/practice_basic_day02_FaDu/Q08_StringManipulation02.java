package practice_basic_day02_FaDu;

import java.util.Scanner;

public class Q08_StringManipulation02 {

		 //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("String1 : ");
        String str1 = scan.nextLine();
        System.out.print("String2 : ");
        String str2 = scan.nextLine();

        System.out.println("String lerin 1. method ile birlestirilmesi : "+str1+" "+str2);
        System.out.println("String lerin 2. method ile birlestirilmesi : "+str1.concat(" " +str2));

        String str1ilksiz = str1.substring(1);
        String str2ilksiz = str2.substring(1);
        System.out.println("String lerin ilk harfsiz halleri : "+str1ilksiz +" " +str2ilksiz);



    }
}
