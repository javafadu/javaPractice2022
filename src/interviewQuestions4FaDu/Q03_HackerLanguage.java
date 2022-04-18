package interviewQuestions4FaDu;

// Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.

import java.util.Arrays;
import java.util.Scanner;

public class Q03_HackerLanguage {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.print("Bir cumle giriniz : ");
        String cumle = scan.nextLine().toLowerCase();

        hackerDili(cumle);


    }

    private static void hackerDili(String cumle) {
        String arr[] = cumle.split("");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("s")) {
                arr[i]="5";
                System.out.print(arr[i]);
            } else if (arr[i].equals("a")) {
                arr[i]="4";
                System.out.print(arr[i]);
            } else if (arr[i].equals("e")) {
                arr[i]="3";
                System.out.print(arr[i]);
            } else if (arr[i].equals("i")) {
                arr[i]="1";
                System.out.print(arr[i]);
            } else if (arr[i].equals("o")) {
                arr[i]="0";
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }

}
