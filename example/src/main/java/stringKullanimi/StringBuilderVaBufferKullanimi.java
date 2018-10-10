package stringKullanimi;

/**
 * Created by Nesrin ÜLGAY on 8/14/2018.
 */
public class StringBuilderVaBufferKullanimi {

    public static void main(String[] args) {

        /**
         * String Buffer ve Builder IMMUTABLE değillerdir. Obdeler üzerinde değişiklik yapılabilir.
         * Eğer oobje üzerinde çokça değişiklik yapılacaksa Stringe nazaran bunlar tercih edilmelidir.
         * StringBuilder thread safe değildir. Yani bu sınıfın metotları syncronized değildir.
         * Bu nedenle Builder Buffer'a göre daha hızlı çalışacaktır.
         */

        StringBuilder stringBuilder = new StringBuilder ();
        char[] karakter = {'j', 'a', 'v', 'a', '7'};
        stringBuilder.append (karakter, 1, 3);
        System.out.println (stringBuilder);

        /**
         * StringBuilder içerisinde appende ve insert komutları vardır. Bunlardan append komutu
         * veriyi birbirinin üzerine olduğu gibi ekler ancak insert komutu ile istediğimiz noktaya veri ekleyebiliriz.
         */

        StringBuilder stringBuilder1 = new StringBuilder ("123");
        char[] name = {'j', 'a', 'v', 'a'};
        stringBuilder1.insert (1, name, 1, 3);// name'in 1. ve 3. index aralığını al. 1.indexin önüne koy.
        stringBuilder1.insert (1, name); // name direk al stringbuilder 1. indexinin önüne koy.

        System.out.println (stringBuilder1);

        StringBuffer buffer = new StringBuffer("abc");
        buffer.append("def");
        System.out.println("sb = " + buffer); //cikti sb = abcdef olacaktir. Modify edilebilir.

        StringBuilder sb1 = new StringBuilder("0123456789");
        sb1.delete(4, 6);
        // index 0 dan baslayacaktir!
        // baslangic indexi dahil,(4)
        // bitis indexi dahil degildir (6)

        System.out.println(sb1);

        sb1.insert(4, "----"); // 4.indexten sonra ekleme yap!(insert)
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);

        /**
         * subSequence alt bir string oluşturu belirtilen şartlara göre.
         */
        System.out.println (sb1.subSequence (2,5));


        int[] dizi = {1,2,3};
        System.out.println (dizi.toString ());


    }
}
