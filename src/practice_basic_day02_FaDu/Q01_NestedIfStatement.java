package practice_basic_day02_FaDu;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz"); // Kullanicidan yas bilgisini aliyoruz
        int age = scan.nextInt();

        if (age < 0) {
            System.out.print("Lutfen yasinizi dogru giriniz : ");
        }
        else if (age < 18 && age >0) {
            System.out.println("Yasiniz oy kullanmaya uygun degil");
        } else {

            if (age >= 70) {
                System.out.println("Yasiniz oy kullanmaya uygun");
                System.out.println("uc kez oy kullanabilirsiniz");
            } else if (age >= 50) {
                System.out.println("Yasiniz oy kullanmaya uygun");
                System.out.println("iki kez oy kullanabilirsiniz");
            } else  {
                System.out.println("Yasiniz oy kullanmaya uygun");
                System.out.println("bir kez oy kullanabilirsiniz");
            }
        }

    }
}


