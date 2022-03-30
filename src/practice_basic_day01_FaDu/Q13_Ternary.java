package practice_basic_day01_FaDu;

public class Q13_Ternary {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */
    public static void main(String[] args) {
        double fiyat = 17.2;

        String sonuc = (fiyat<10)? "ucuz" : ((fiyat>=10 && fiyat<20)? "normal":"pahali");
        System.out.println(sonuc);
    }
}
