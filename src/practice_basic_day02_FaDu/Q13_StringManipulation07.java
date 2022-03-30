package practice_basic_day02_FaDu;

public class Q13_StringManipulation07 {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {

        String str = "abcdxycza";
        Boolean sonuc = str.contains("xyz") ? true : false ;
        System.out.println(sonuc);


    }
}
