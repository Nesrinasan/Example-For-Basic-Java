package egitim;

import model.Ogretmen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Universal on 12/3/2019.
 */
public class Okul {
     String adi;
    private int sinifSayisi;
    static String ogretmenAdi;

    public Okul(){

    }

    public Okul(String adi, int sinifSayisi) {
        this.adi = adi;
        this.sinifSayisi = sinifSayisi;
    }

    public List<Ogretmen> getOgretmenBilgisi(){
        List<Ogretmen> ogretmenList = new ArrayList<>();

        try {
            Ogretmen ogretmen = null;
            ogretmen.setAdi("Ahmet");
            ogretmenList.add(ogretmen);

        }catch (Exception e){
            System.out.println("Öğretmen nesnesi oluşturulmadı");
            throw new RuntimeException();
        }

        return ogretmenList;
    }

    public void getOkulBilgisi(){
        List<Ogretmen> ogretmenList = new ArrayList<>();

        try {
            Ogretmen ogretmen = null;
            ogretmen.setAdi("Ahmet");
            ogretmenList.add(ogretmen);
//            throw new RuntimeException("hata oluştu");

        }catch (Exception e){
            System.out.println("Öğretmen nesnesi oluşturulmadı");
            throw new RuntimeException("hata oluştu");
        }
    }


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getSinifSayisi() {
        return sinifSayisi;
    }

    public void setSinifSayisi(int sinifSayisi) {
        this.sinifSayisi = sinifSayisi;
    }

    public String getOgretmenAdi() {
        return ogretmenAdi;
    }

    public void setOgretmenAdi(String ogretmenAdi) {
        this.ogretmenAdi = ogretmenAdi;
    }
}
