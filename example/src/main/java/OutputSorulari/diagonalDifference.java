package OutputSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Universal on 6/30/2019.
 */
public class diagonalDifference {

    /***
     * 3e 3 olan matrisin sağdan sola diagonal toplam değerini soldan sağa diagonal değerden çıkar.
     * Farkını bul.
     *
     * 11 2 4
     * 4  5 6
     * 10 8 -12
     *
     * 4+5+10 - (11+5+(-12)) = 15
     *
     * @param args
     */

    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        list1.add(11);
        list1.add(2);
        list1.add(4);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        list3.add(10);
        list3.add(8);
        list3.add(-12);

        arr.add(list1);
        arr.add(list2);
        arr.add(list3);

        int row = 1;
        int sumLeftToRigth = 0;
        int sayac = 0;
        int sonuc = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (row > arr.size()) {
                break;
            }
            List<Integer> subList = arr.get(i);
            for (int j = 0; j < subList.size(); j++) {
                sumLeftToRigth = sumLeftToRigth + subList.get(sayac);
                sayac++;
                break;

            }
            row++;

        }

        row = 1;
        int sumRightToLeft = 0;
        sayac = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (row > arr.size()) {
                break;
            }
            List<Integer> subList = arr.get(i);

            for (int j = subList.size() - 1; j > 0; j--) {
                if(row == 1) {
                    sayac = subList.size() - 1;
                }
                sumRightToLeft = sumRightToLeft + subList.get(sayac);

                break;

            }
            sayac--;
            row++;

        }

        if (sumLeftToRigth > sumRightToLeft) {
            sonuc = sumLeftToRigth - sumRightToLeft;
        } else {
            sonuc = sumRightToLeft - sumLeftToRigth;
        }

        System.out.println(sonuc);

    }
}
