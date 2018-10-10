package stringKullanimi;

/**
 * Created by Universal on 8/17/2018.
 */
public class equalsvehashcode {

    public static void main(String[] args) {

        String x = "Nesrin";
        String y = "Ulgay";
        String z = "Asan";
        /**
         *
         * Objelerin içeriğini, primitive tiplerin kendisini kontrol eder.
         * == ile farkı "==" yapısı Objelerin referanslarını kontrol eder. Referenas eşitliği yapar. İçeriği kontrol etmez.
         * Ama primitive tiplerin kendisini direkt konrol eder.
         *  equals metodunun sahip olmasi gereken su ozellikler mevcuttur;
         */

        //EQUALS CONTRACT NEDİR
        /**
         * 1- reflexive(yansimali)
         */
        x.equals (x); //true olmalidir.


        /**
         * 2 - symmetric(simetrik)
         */
        x.equals (y); //true ise
        y.equals (x); //true olmalidir.

        /**
         * 3-  transitive (gecisli)
         *
         */
        x.equals (y); //true
        y.equals (z); //true ise
        x.equals (z); //true olmalidir

        /**
         * 4- consistent (tutarli)
         * equals metodunun bir cok defa kullanilmasinda sonuc degismemelidir.Tutarli olmalidir.
         */
        x.equals (y); // true ise her zaman true donmelidir.


        /**
         *   null reference
         */
        x.equals (null); // false deger donmelidir.


        /*******************************************************************************************************************/

        /**
         * HASHCODE YAPISI
         *
         * hashCode 32 bit signed/isaretli tekil bir degerdir/sayidir. hasCode degerini objeler icin ID degeri olarak dusunebiliriz.
         * HashMap ,Hashtable HashSet gibi Collection yapilari ilgili objelerin store/ saklanmasi/
         * doldurulmasi konusunda hashCode degerini kullanir.
         * Hashcode değeri collection yapılarında kullanılır.
         * Aynı hashcode'a sahip nesnelere bakılarak collectionlar ayırt edilir ve buradan nesneye ulaşmak daha verimli olur.
         *Aynı hashcode'u bütün nesnelere verirseniz hepsi aynı collectionda olacaktır arama işlemleri verimsizleşecektir.
         * HASHCODE : DOĞRU COLLECTION YAPISINI BUL,
         * EQUALS : DOĞRU ELEMANI BUL.
         *
         * hashcode'u override etmek gereklidir.
         *
         */




    }

}
