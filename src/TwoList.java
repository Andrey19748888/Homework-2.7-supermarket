import java.util.ArrayList;
import java.util.List;

public class TwoList { public static void main(String[] args) {

    List<List<String>> biDemArrList = new ArrayList<>();
    for (int i = 0; i < 8; i++)
    {
        biDemArrList.add(i, new ArrayList<>());
        for (int j = 0; j < 8; j++) {
            if ( i % 2 == 0 && j % 2 == 0 ){
                biDemArrList.get(i).add("◯");
            } else if (i % 2 != 0 && j % 2 > 0) {
                biDemArrList.get(i).add("◯");

            } else {
                biDemArrList.get(i).add(".");
            }
        }
    }
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            System.out.print(biDemArrList.get(i).get(j) + " ");
        }
        System.out.println();
    }

}
}

