package abstractClass;

import abstractClass.baseClass;

/**
 * Created by Nesrin ÜLGAY on 3/25/2019.
 */
public class derivedClass extends baseClass {

    String adi;
    /**
     * Ortak özellikleri olan classlar üretmek istediğimiz zaman bu classları ortak bir paydada toplamak amacıyla
     abstract class kullanırız.
     ***Amacı: Kod düzenini ve tekrarı önlemektir. Zaten kendisinden nesne de üretilmez. Bu da amacının kod düzeni sağlamak olduğunu gösteriyor.
     ***Eğer baseClass içerisinde abtract bir metot yazarsak kendisinden türetilen derivedClass içerisinde bu classı kullanmak zorundayız.
     ***Ancak eğer derivedClass ta abtract class ise base classtaki abtract metot kullanılmak zorunda değildir.
     Override ederek kullanabiliriz.
     ***baseClass içerisinde tanımlanan spesifik constructur kendisinden türetilen derivedClass içerisinde de kullanılmak zorundadır.
     'super' kelimesi ile alınır bu yapılandırıcı.
     */

    /**
     * türetilmiş class parent class'ın constructur'ını çağırabilir AMA MİRAS ALAMAZ.
     * @param adi
     * @param soyadi
     */
    public derivedClass(String adi, String soyadi) {
        super(adi, soyadi);
    }


    /**
     * Eğer baseClass farklı paket içerisinde ise classın içerisinde ki acceess modifiers
     * default olan abstract metot ve değişkenlere erişim sağlanamaz. Protected olarak değiştirmek gerekir.
     *
     */
    @Override
    void getir() {
        System.out.println(adi);
    }

    /**
     *
     */
    public void modifiers(){
        System.out.println(soyadi + adi);
    }
}
