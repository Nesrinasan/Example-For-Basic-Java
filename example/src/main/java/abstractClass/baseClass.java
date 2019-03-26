package abstractClass;

/**
 * Created by Universal on 3/25/2019.
 */
public abstract class baseClass {

    protected String adi;
    String soyadi;

    public baseClass(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
    }

    abstract void getir();


}
