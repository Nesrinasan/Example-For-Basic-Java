package stringKullanimi;

/**
 * Created by Nesrin ÜLGAY on 8/14/2018.
 */
public class IndexOfKullanimi {

    public static void main(String[] args) {

        String letters = "ABCAB";
        System.out.println (letters.indexOf ('B'));  // 'B' nin ilk kullanıldığı index numarasını verir
        System.out.println (letters.indexOf ("S")); // S 'nin kullanıldığı index. Eğer yoksa böyle birşey -1 döner.
        System.out.println (letters.indexOf ("CA")); // CA kelime grubu olarak başladığı index numarası.

        /**
         * ikinci 'o' nun kullanıldığı index.
         */
        String b1 = "Morning koo org";
        int o = b1.indexOf ('o', 2);
        System.out.println (o);
    }

}
