package practice_basic_day02_FaDu;

public class Q06_NestedIfandTernary {
    /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
    public static void main(String[] args) {

        int sayi = 8;

        System.out.println("-----NESTED IF ILE COZUM------");

        if(sayi<0 || sayi>9) {
            System.out.println("Gecersiz sayi");
        }
        else {
            if (sayi==1) {
                System.out.println("Bir");
            }
            else if (sayi==2) {
                System.out.println("Iki");
            }else if (sayi==3) {
                System.out.println("Uc");
            }else if (sayi==4) {
                System.out.println("Dort");
            }else if (sayi==5) {
                System.out.println("Bes");
            }else if (sayi==6) {
                System.out.println("Alti");
            }else if (sayi==7) {
                System.out.println("Yedi");
            }else if (sayi==8) {
                System.out.println("Sekiz");
            }else if (sayi==9) {
                System.out.println("Dokuz");
            } else {
                System.out.println("System Error");
            }


            System.out.println("-----TERNARY ILE COZUM------");

            String result = (sayi<0 || sayi>9) ? "Gecersiz" :
                    sayi==1 ? "Bir" :
                            sayi==2 ? "Iki" :
                                    sayi==3 ? "Uc" :
                                            sayi == 4 ? "Dort" :
                                                    sayi == 5 ? "Bes":
                    sayi==6 ? "Alti" :
                            sayi == 7 ? "Yedi" :
                                    sayi == 8 ? "Sekiz" : "Dokuz";
            System.out.println(result);
        }

    }
}
