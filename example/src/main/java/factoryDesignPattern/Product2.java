package factoryDesignPattern;

/**
 * Created by Universal on 2/26/2018.
 */
public class Product2 implements IProduct{

    String urunFiyat;
    String kategoriAd;

    public  Product2(){
        urunFiyat = "Fransız ürünleri 25TL";
        kategoriAd = "Fransıız";
    }

    @Override
    public String getUrunFiyat() {

        return urunFiyat;
    }

    public String getKategoriAd() {
        return kategoriAd;
    }

    public void setKategoriAd(String kategoriAd) {
        this.kategoriAd = kategoriAd;
    }
}
