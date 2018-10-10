package factoryDesignPattern;

/**
 * Created by Universal on 2/26/2018.
 */
public class Product implements IProduct{

    String urunfiyat;
    String urunAdi;

    public Product() {
        urunfiyat = "Alman ürünü 50 TL";
    }

    @Override
    public String getUrunFiyat() {
        return urunfiyat;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
}
