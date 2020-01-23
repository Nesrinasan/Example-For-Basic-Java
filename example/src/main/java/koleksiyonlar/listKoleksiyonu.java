package koleksiyonlar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Universal on 9/25/2019.
 */
public class listKoleksiyonu {
    public static void main(String[] args) {
        List yeniList = new ArrayList();
        yeniList.add("fırat");
        yeniList.add("doruk");
        yeniList.add("nesrin");

//        System.out.println(yeniList);
//        for (int i = 0; i <yeniList.size() ; i++) {
//            System.out.println(yeniList.get(i));

         {
             // grubun ilk elemanını bulma

//            System.out.println(yeniList.get(0));

             // grubun son elm-emanını bulma

             System.out.println( yeniList.get(yeniList.size()- 1) );

        }
        }



    }

