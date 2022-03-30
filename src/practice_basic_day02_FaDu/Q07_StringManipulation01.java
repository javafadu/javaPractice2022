package practice_basic_day02_FaDu;

public class Q07_StringManipulation01 {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {


        // 2 Strings olusturun -> string1 = "01234" and string2 = "56789"
        // 1.yol: concat() function ile concatenate string1 and string2
        // 2.yol: operator kullanarak concatenate string1 and string2
        // konsolda yazdiriniz

        String str1 = "01234";
        String str2 = "56789";
        System.out.println("Concat ile :" +str1.concat(str2));
        System.out.println("Operator ile : " +(str1+str2));

    }
}
