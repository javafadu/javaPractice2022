package practice_basic_day01_FaDu;

import java.util.Scanner;

public class Q09_Scanner02 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Please enter your name and surname");
        String name = scan.nextLine();

        System.out.println("Please enter where you are from");
        String city = scan.nextLine();

        System.out.println("Please enter your current location now");
        String location = scan.nextLine();

        System.out.println("Please enter your birtdate year");
        int birtdateYear = scan.nextInt();
        int age = 2022-birtdateYear;

        System.out.println("Please enter your height in cm");
        double height = scan.nextDouble();

        System.out.println("Do you like your location or not (type yes or no)");
        String like = scan.next();

        if(like.equalsIgnoreCase("yes")) {
            System.out.println("Your Name : "+name);
            System.out.println("You are from : "+city);
            System.out.println("Your Curren Location : "+location);
            System.out.println("Your Age : "+age);
            System.out.println("Your Height : "+height);

        }
        else {
            System.out.println("You do not like your location");
        }
    }







}
