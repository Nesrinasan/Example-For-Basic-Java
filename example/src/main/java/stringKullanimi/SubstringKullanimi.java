package stringKullanimi;

/**
 * Created by Nesrin ÜLGAY on 8/13/2018.
 */
public class SubstringKullanimi {
    public static void main(String[] args) {

        /**
         * Substring kullanımı
         */

        String exam = "Oracle";
        String substring = exam.substring (2);   //--> 2. indisten sonrasını alır.  indis 0'dan başlar.
        System.out.println (substring);

        String x = exam.substring (2, 3);  // --> 2 ve 3. indisler arasını alacaktır sadece. 2 dahil 3 dahil değil
        System.out.println (x);

        /**
         * aşağıdaki kodun çıktısı SunDday'dır. Çünkü String immutable'dir değişmez
         */

        String day = "SunDday";
        day.replace ('D', 'Z').substring (3);
        System.out.println (day);

        /**
         * nunu çıktısı ZDAY dir çünkü yeni day string'i verildi.
         */
        day = day.replace ('D', 'Z').substring (3);
        System.out.println (day);


        String s = new String("nesrin");
        String s2 = new String("nesrin");
        System.out.println(s == s2);
        System.identityHashCode(s);
    }
}
