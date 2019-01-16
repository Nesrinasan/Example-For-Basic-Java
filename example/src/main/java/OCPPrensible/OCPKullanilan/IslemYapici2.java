package OCPPrensible.OCPKullanilan;

/**
 * Created by Nesrin ÜLGAY on 1/16/2019.
 */
public class IslemYapici2 {

    IIslem iIslem;

    /**
     * Yapılandırıcı metoda interface'i verdim. Böylece bu class üzerinde artık hiçbir değişiklik yapmadan,
     * UcuncuIslem, DorduncuIslem vs. gibi yeni classları eklediğimde sadece IIslem sınıfından implement etmem yeterli olacaktır.
     * Bu class üzerinde artık bir değişiklik yapmam gerekmeyecektir.
     * @param iIslem
     */
    public IslemYapici2(IIslem iIslem) {
        this.iIslem = iIslem;
    }

    public void islemYap() {
        iIslem.islemYap ();
    }
}
