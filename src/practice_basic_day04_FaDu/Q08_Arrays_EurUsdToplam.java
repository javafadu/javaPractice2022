package practice_basic_day04_FaDu;

public class Q08_Arrays_EurUsdToplam {
    public static void main(String[] args) {
      /*
       *  String 2D array olustur
       *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
       *  String de $ varsa 3.2 ile carp
       *  String de € varsa 4.2 ile carp
       *  double olarak yazdir
       */

        String arr[][] = {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        String usd="";
        double usdToplam = 0.0;
        String eur="";
        int eurToplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j].contains("$")) {
                    usd = arr[i][j].replace("$","");
                    usdToplam+=Integer.valueOf(usd)*3.2;

                }
                if(arr[i][j].contains("€")) {
                    eur = arr[i][j].replace("€","");
                    eurToplam+=Integer.valueOf(eur)*4.2;

                }


            }

        }
        System.out.println("USD ler toplami : "+usdToplam);
        System.out.println("EUR lar toplami : "+eurToplam);
        System.out.println("Genel Toplam : "+(usdToplam+eurToplam));

    }
}
