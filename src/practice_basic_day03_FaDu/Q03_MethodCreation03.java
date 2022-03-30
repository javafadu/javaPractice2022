package practice_basic_day03_FaDu;

public class Q03_MethodCreation03 {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
    public static void main(String[] args) {

        double cmDeger = 120;

        donustur(cmDeger);

    }

    private static void donustur(double cmDeger) {
        System.out.println("Verilen Degerin Metre Karsiligi : "+(cmDeger/100));
        System.out.println("Verilen Degerin Kilometre Karsiligi : "+(cmDeger/100000));
    }

}