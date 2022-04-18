package interviewQuestions4FaDu;

// int array list oluşturun 10 elemandan oluşmalı
// random ekle isinde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemaının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.

import java.util.ArrayList;

public class Q02_CreateRandomListSetList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        randomEkle(list);
    }

    private static void randomEkle(ArrayList<Integer> list) {

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random()*20)); // double veri tipine sahip olan Math.random
            // class i hata verdiginden int yaptik
        }
        System.out.println("Random list : "+list);

        int sayac=0;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0) {
                list.set(i,111);
                sayac++;
            }
        }

        System.out.println("111 ler eklendikten sonra : "+list);
        if(sayac==0) {
            System.out.println("Listede cift sayi yoktur");
        }
    }

}
