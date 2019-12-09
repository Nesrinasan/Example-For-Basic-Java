package exceptionhandling;

import dizilervelisteler.Ogrenci;
import egitim.Ogretmen;
import egitim.Okul;

/**
 * Created by Universal on 12/7/2019.
 */
public class uncheckedException {

    public static void main(String[] args) {
        Okul okul = null;
        try {
            okul.setAdi("Hayrullah Kefoğlu Lisesi");
//
        }catch (NullPointerException e){
            System.out.println("Lütfen okul nesnesini doldurunuz."+ e.getStackTrace() + " bb" );
            throw new NullPointerException("İÇerideyim");
        }catch (Exception e){
            System.out.println("Exception hatası aldım");
        }
        System.out.println("dışarıya çıktı");


    }
}
