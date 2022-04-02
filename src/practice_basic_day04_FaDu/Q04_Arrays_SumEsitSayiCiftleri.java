package practice_basic_day04_FaDu;

public class Q04_Arrays_SumEsitSayiCiftleri {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */

        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam = 9;

        sayiCiftleri (arr,istenenToplam);



    }

    private static void sayiCiftleri(int[] arr, int istenenToplam) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==istenenToplam) {
                    System.out.print(arr[i]+" and "+arr[j]+" sum "+istenenToplam+"\n");
                }

            }

        }System.out.println();
    }

}

			/*
			5 and 4 sum is 9
			7 and 2 sum is 9
			-6 and 15 sum is 9
			8 and 1 sum is 9
			 */