package practice_basic_day02_FaDu;

public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {

        char finalNot = 'D';

        String sonuc = finalNot=='A' ? "Gayet Basarili" :
                (finalNot=='B'? "Basarili" : (finalNot=='C'? "Ha Gayret": "Diğerleri")) ;
        System.out.println(sonuc);

    }
}
