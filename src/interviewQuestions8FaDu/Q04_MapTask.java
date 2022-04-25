package interviewQuestions8FaDu;

import java.util.*;

public class Q04_MapTask {
    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> grupIsimVeUyeler = new HashMap<>();
        ArrayList<String> devTeam = new ArrayList<>(Arrays.asList("Abdullah", "Kutay", "Enes Faruk", "Yasin","Faruk"));
        ArrayList<String> qaTeam = new ArrayList<>(Arrays.asList("Kadir", "Seher", "Gokhan", "Bahattin"));

        grupIsimVeUyeler.put("Development Team", devTeam);
        grupIsimVeUyeler.put("QA Team",qaTeam);

        System.out.println(grupIsimVeUyeler);
        // {QA Team=[Kadir, Seher, Gokhan, Bahattin], Development Team=[Abdullah, Kutay, Enes Faruk, Yasin, Faruk]}


        // BOLUM 2 - YOL 1
                // value lardan giderek

        Collection<ArrayList<String>> values = grupIsimVeUyeler.values();

        for (ArrayList<String> each: values
             ) {
            System.out.println(each.size());  // 4 ve 5
        }

        // BOLUM 2 - YOL 2
        // key lerden giderek

        Set<String> keys = grupIsimVeUyeler.keySet();  // key leri Set olarak donduru

        for (String each: keys
             ) {
           ArrayList<String> grupList = grupIsimVeUyeler.get(each);
            System.out.println("Gruptaki uye sayisi : "+each+" "+grupList.size());
            // Gruptaki uye sayisi : QA Team 4
            // Gruptaki uye sayisi : Development Team 5
        }

    }

}
