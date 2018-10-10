package stringKullanimi;

/**
 * Created by Nesrin ÜLGAY on 8/13/2018.
 */
public class StringPool {

    public static void main(String[] args) {
        /**
         * String pool kullanımı.
         * String pool yani String Constant Pool adı verilen havuza veriler atılır.
         * ve içeirisnde aynı veri varsa tekrar üretmez.
         *
         */

        String summer = new String ("Summer"); //--> yeni bir nesne oluşturur.
        String summer2 = "Summer"; // --> String constant pool'a Summer değerini ekler. Ama öncesinde summer nesnesi eklendiği için tekrar eklenmez.
        System.out.println ("Summer"); // --> String constant pool'a Summer değerini EKLEMEZ. Çünkü içeride var
        System.out.println ("autumn"); //--> String constant Pool'a autumn değerini ekler.
        System.out.println ("autumn" == "summer"); //--> false döner.
        System.out.println ("Summer");//--> String constant pool'a değer eklemez. Çünkü bu değer havuzda var.

        System.out.println(summer == summer2); // --> İÇeride bir adet yeni nesne bir adet srting pool içeirisne atılmış nesne bulunmaktadır.
        // == operatoru  sadece adres refer ettiği için false olur.

        /**
         * str ve str1 == operatorü ile veya equals ile karşılaştırıldığnda true döner. String pool üzerinden aldıkları için
         * hem değeri hem referansları aynıdır.
         */
        String str = "kelime";
        String str1 = "kelime";
        System.out.println (str == str1);
        System.out.println (str.equals (str1));




    }

}
