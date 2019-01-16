package OCPPrensible;

import OCPPrensible.OCPKullanılan.IIslem;
import OCPPrensible.OCPKullanılan.IlkIslem;
import OCPPrensible.OCPKullanılan.IslemYapici2;
import OCPPrensible.OCPKullanılmayan.IslemYapici;

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
