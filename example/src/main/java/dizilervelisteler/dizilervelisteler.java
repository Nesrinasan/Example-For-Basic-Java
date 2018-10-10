package dizilervelisteler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nesrin ÜLGAY on 8/15/2018.
 */
public class dizilervelisteler {

    /**
     * Diziler sadece CHAR, BYTE, SHORT, INT değerleri almalıdır. Yoksa compile time hatası alacaklardır.
     * @param args
     */

    public static void main(String[] args) {
        List<String> DinamikDizi = new ArrayList ();

        DinamikDizi.add ("Serdar");
        DinamikDizi.add ("Mahmut");
//        DinamikDizi.remove ("Serdar");
//        DinamikDizi.clear ();
        boolean contains = DinamikDizi.contains ("ma");

        DinamikDizi.set (1, "ayşe");// 1. indexi güncelleme işlemi yapar.
        for (String s : DinamikDizi) {
            System.out.println (s);
        }

        List<StringBuilder> strings = new ArrayList<> ();
        StringBuilder stringBuilder = new StringBuilder ();
        stringBuilder.append ("nesrin");
        StringBuilder stringBuilder1 = new StringBuilder ("burak");
        strings.add (stringBuilder);
        strings.add (stringBuilder1);
        strings.remove (new StringBuilder ("burak"));
        for (StringBuilder string : strings) {
            System.out.println (string);
        }

        /**
         *  iki ayrı nesne oluşturtupu için her zaman
         farklı referanslara bakar. String poola veri atmaz.
         */
        System.out.println (stringBuilder.equals (new StringBuilder ("nesrin")));

        List<String> stringList = new ArrayList<> ();
        String one = new String ("One");
        String two = new String ("Two");
        stringList.add (one);
        stringList.add (two);
        List<String> yourList = stringList;
        one.replace ('0', 'B');

        for (String s : yourList) {
            System.out.println (s);
        }
        for (String s : stringList) {
            System.out.println (s);
        }

        /**
         * compile time hatası vermez. double, float vb değerler verilirse compile time hatası verecektir.
         * - 1 değeri runtime hatası verir. "ArrayIndexOutOfBoundsException" hatası.
         */
        int dizi[]= new int[2];
        System.out.println (dizi[-1]);

        /**
         * Dizi Type "INTERFACE", "ABSTRACT" class olabilir.
         */
        IDizi[] dizis = new IDizi[]{new Dizi1 ()};

        /**
         * ArrayList
         */
        List<String> list = new ArrayList<> ();
        list.add ("nesrin");
        list.add ("burak");
        list.set (1,"cemil");
        System.out.println ("string list size: " + list.size ());

        List<StringBuilder> stringBuilders = new ArrayList<> ();
        stringBuilders.add ( new StringBuilder ("nesrin"));
        stringBuilders.add (new StringBuilder ("burak"));
        stringBuilders.set (1, new StringBuilder ("cemil"));
        System.out.println ("stringBuilder list size: " + stringBuilders.size ());

        List<String> sayiList = new ArrayList<> ();
        sayiList.add ("One");
        String iki = new String ("Two");
        sayiList.add (iki);

        List<String >sayi2List = sayiList;
        iki.replace ('O', 'B');

        for (String s : sayiList) {
            System.out.println ("sayiList :" + s);
        }
/**
 * iki for sonucu aynı çıkacaktır. iki replace olduktan sonra herhangi bir ekleme değiştirme vs olmadı çünkü
 */
        for (String s : sayi2List) {
            System.out.println ("sayi2List :" + s);
        }


        /**
         * aşağıdaki iki durumda da false sonucu dönecektir.
         * Eğer Ogrenci classı içerisinde bir equals metodu yazılır ve aynı içeriğe sahip veriler için referans değeri aynı alınırsa ikinci sorguda true sonucu dönecektir.
         *
         */
        List<StringBuilder> stringBuilderList = new ArrayList<> ();
        StringBuilder sb1 = new StringBuilder ("Jan");
        StringBuilder sb2 = new StringBuilder ("Feb");

        stringBuilderList.add (sb1);
        stringBuilderList.add (sb2);
        stringBuilderList.add (sb2);

        System.out.println (stringBuilderList.contains (new StringBuilder ("Jan")));

        List<Ogrenci> stringBuilderOgrList = new ArrayList<> ();
        Ogrenci sbOgr1 = new Ogrenci ("Jan");
        Ogrenci sbOgr2 = new Ogrenci ("Feb");

        stringBuilderOgrList.add (sbOgr1);
        stringBuilderOgrList.add (sbOgr2);

        System.out.println (stringBuilderOgrList.contains (new Ogrenci ("Jan")));

        int[] arr = new int[5];
        byte b=4; char c='c'; int longVar=10;
        arr[0] = b;
        arr[1] = c;
        arr[3]= longVar;
        System.out.println (arr[0] + " " + arr[1]+arr[2] + " " +arr[3]);

    }

    static class Dizi1 implements IDizi{

    }

}
