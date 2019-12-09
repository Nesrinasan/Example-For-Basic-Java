package exceptionhandling;

import egitim.Ogretmen;
import egitim.Okul;

import java.util.List;

/**
 * Created by Universal on 12/7/2019.
 */
public class test2 {
    public static void main(String[] args) {
        getOkulBilgisi();
    }

    private static void getOkulBilgisi() {
        Okul okul = new Okul();
        okul.setAdi("Cumhuriyet lisesi");
        try {
            okul.getOkulBilgisi();
//            List<Ogretmen> ogretmenBilgisi = okul.getOgretmenBilgisi();
            Ogretmen ogretmen = null;
            ogretmen.setAdi("sd");

        }catch (Exception e){
            System.out.println("ogretmen bilgisi çekilirken bir hata oluştu");
            e.printStackTrace();
        }

    }
}
