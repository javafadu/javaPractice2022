package practice_basic_day01_FaDu;

import java.util.Scanner;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade");
        double grade = scan.nextDouble();

        if(grade >100 || grade <0) {
            System.out.println("Please enter a valid grade number");
        }
        else if (grade<60) {
            System.out.println("Your Note : F");
        }else if (grade<70) {
            System.out.println("Your Note : D");
        }else if (grade<80) {
            System.out.println("Your Note : C");
        }else if (grade<90) {
            System.out.println("Your Note : B");
        }else  {
            System.out.println("Your Note : A");
        }

    }


}
