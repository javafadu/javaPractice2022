package practice_basic_day01_FaDu;


import java.util.Scanner;

public class Q12_IfStatement03 {
		/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your job title");
            String jobTitle = scan.next();

            if(jobTitle.equals("qa")) {
                System.out.println("qa : Quality Analyst");
            }else if(jobTitle.equals("dev")) {
                System.out.println("dev : Developer");
            }else if(jobTitle.equals("ba")) {
                System.out.println("ba : Business Analyst");
            } else if(jobTitle.equals("pm")) {
                System.out.println("pm : Project Manager");
            } else {
                System.out.println("Please enter a valid job title");
            }
        }
}
