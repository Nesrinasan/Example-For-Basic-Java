package OCPPrensible.OCPKullanilmayan;

import OCPPrensible.EnumIslemTipi;

/**
 * Created by Nesrin ÜLGAY on 1/16/2019.
 */
public class IslemYapici {

    IlkIslem ilkIslem = new IlkIslem ();
    IkinciIslem ikinciIslem = new IkinciIslem ();

    /**
     * Ucuncu Islemi eklemek istediğim zaman IslemYapici Class değişmiş olacak.
     * Bu OCP prensibine aykırıdır.
     * Bu nedenle OCP prensibine uygunluk açısından yapıyı Interface gibi soyut yapıya taşıyarak,
     * İstediğim kadar genişletebileceğim.
     *
     * @param enumIslemTipi
     */

    public void islemiYap(EnumIslemTipi enumIslemTipi){
        switch (enumIslemTipi){
            case IlkIslem:
                ilkIslem.islem ();
                break;
            case IkinciIslem:
                ikinciIslem.islem ();
                break;
        }
    }
}
