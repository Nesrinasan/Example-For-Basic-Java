package koleksiyonlar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Universal on 9/25/2019.
 */
public class listKoleksiyon2 {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(45);
        liste.add(32);
        liste.add(63);
        liste.add(54);
        liste.add(25);
        liste.add(36);
        liste.add(98);
        liste.add(475);

        // 3 ile bölümünde kalanları bul

//        for (int i = 0; i <liste.size() ; i++) {
//
//            int sayi = liste.get(i);
//            int kalan = sayi % 3;
//
//            System.out.println(kalan);
//
//
//        }

        //3 ile bölümden kalan 0 olanları listeden çıkar

        for (int i = 0; i <liste.size() ; i++) {

            int eleman = liste.get(i);
            if (eleman % 3 == 0){
               liste.remove(i);

            }
        }


        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        // türü long olann liste oluştur , 25 ile 35 arasındaki elemanları sil

        List<Integer> liste2 = new ArrayList<>();

        liste2.add(29);
        liste2.add(36);
        liste2.add(28);
        liste2.add(10);
        liste2.add(32);
        liste2.add(89);

        for (int i = 0; i <liste2.size() ; i++) {
            int eleman = liste2.get(i);

            if (25 < eleman && eleman < 35 ){
                liste2.remove(i);
            }


        }


    }
}
