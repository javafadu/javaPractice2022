package practice_basic_day03_FaDu;

public class Q02_MethodCreation02 {
/*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {
        String input = "Benim adim Faruk Duyar, senin adin nedir?";
        String output = removeDub(input);
        System.out.println("Verilen String : "+input);
        System.out.println("Stringdeki karakterler : "+output);

    }

    private static String removeDub(String input) {
        String yeniInput="";

        for (int i = 0; i <input.length() ; i++) {
            if(yeniInput.indexOf(input.substring(i,i+1))<0) {
                yeniInput+=input.substring(i,i+1);
            }
        }

        return yeniInput;
    }


}
