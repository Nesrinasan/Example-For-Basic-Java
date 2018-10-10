package stringKullanimi;

/**
 * Created by Nesrin ÜLGAY on 8/13/2018.
 */
public class charAtKullanimi {

    public static void main(String[] args) {
        /**
         * charAt() kullanımı
         */
        String letters ="ABCAB";
        System.out.println (letters.indexOf ('B'));
        System.out.println (letters.indexOf ("S"));
        System.out.println (letters.indexOf ("CA"));

        // eğer kelime içersindeki bir harfin kaçıncı kullanımından sonrasını görmek istiyorsak aşağıdaki gibi yazmamıs gerekiyor

        System.out.println (letters.indexOf ('B', 2));
    }
}
