package stringKullanimi;

/**
 * Created by Universal on 8/14/2018.
 */
public class concatKullanimi {

    public static void main(String[] args) {

        String str = "hello";
        str = str +" world";
        System.out.println (str);

        /**
         * concat ile atama operatorü aynı işi yaparlar.
         * İki durumda da yeni bir nesne oluşur.
         * Stringin immutable yapısı korunur.
         * Concat kullanımında nullpointer hatası olma durumu olabilir sadece.
         *
         */
        String kelime = " Hi";
        kelime = kelime.concat ("Nesrin"+ " "+" burak");
        System.out.println (kelime);


    }
}
