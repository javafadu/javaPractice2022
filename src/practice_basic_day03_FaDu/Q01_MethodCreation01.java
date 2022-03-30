package practice_basic_day03_FaDu;


import java.util.Scanner;

public class Q01_MethodCreation01 {

    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("******BASIT HESAP MAKINESI*****");
        System.out.println("Toplama Islemi : +\nCikarma Islemi : -\n" +
                "Carpma Islemi : *\nBolme Islemi : /");
        System.out.print("Lutfen Listeden Yapacaginiz Islemi Seciniz : ");
        String islem = scan.next();

        if(islem.equals("+") || islem.equals("-") || islem.equals("*") || islem.equals("/")) {
            System.out.print("Islem Yapacaginiz Ilk Sayiyi Giriniz : ");
            int sayi1 = scan.nextInt();
            System.out.print("Islem Yapacaginiz Ikinci Sayiyi Giriniz : ");
            int sayi2 = scan.nextInt();
            hesapMakinesi(islem, sayi1, sayi2);
        } else {
            System.out.println("Hatali bir islem secimi yaptiniz: ");
        }






    }

    private static void hesapMakinesi(String islem, int sayi1, int sayi2) {

        switch (islem) {

            case "+":
                System.out.println("Toplama Islemi Sonucu : " + (sayi1 + sayi2));
                break;
            case "-":
                System.out.println("Cikarma Islemi Sonucu : " + (sayi1 - sayi2));
                break;
            case "*":
                System.out.println("Carpma Islemi Sonucu : " + (sayi1 * sayi2));
                break;
            case "/":
                System.out.println("Bolme Islemi Sonucu : " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Sistem Hatasi");
                break;

        }

    }


}