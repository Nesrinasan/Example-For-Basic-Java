package OCPPrensible;

import OCPPrensible.OCPKullanilan.IIslem;
import OCPPrensible.OCPKullanilan.IlkIslem;
import OCPPrensible.OCPKullanilan.IslemYapici2;
import OCPPrensible.OCPKullanilmayan.IslemYapici;

/**
 * Created by Nesrin ÜLGAY on 1/16/2019.
 */
public class MainClass {

    public static void main(String[] args) {

        /**
         * OCP Kullanmadan
         */
        IslemYapici islemYapici = new IslemYapici ();
        islemYapici.islemiYap (EnumIslemTipi.IlkIslem);

        /**
         * OCP Kullanarak
         */
        IIslem ilkIslem = new IlkIslem ();
        IslemYapici2 islemYapici2 = new IslemYapici2 (ilkIslem);
        islemYapici2.islemYap ();

    }
}
