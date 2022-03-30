package practice_basic_day02_FaDu;

public class Q09_StringManipulation03 {

    // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

    public static void main(String[] args) {
        String  str1= "$13.99";
        String str2= "$10.55";

        System.out.println("1. YOL -> double valueOf ile");
        double str1_1 = Double.valueOf(str1.substring(1));
        double str2_2 = Double.valueOf(str2.substring(1));
        System.out.println("Sayilarin toplami : "+(str1_1+str2_2));

        System.out.println("2. YOL -> Replace ile");
        String str1_1_1 = str1.replaceAll("\\D","");
        String str1_2_2 = str2.replaceAll("\\D","");
        System.out.println("Sayilarin toplami : "+(Double.valueOf(str1_1_1)/100+Double.valueOf(str1_2_2)/100));





    }
}
