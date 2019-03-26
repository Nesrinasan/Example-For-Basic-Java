package stringKullanimi;

import java.util.ArrayList;

/**
 * Created by Nesrin ÜLGAY on 8/13/2018.
 */
public class atamaOperatoru {

    public static void main(String[] args) {
        String str1 = new String ("Nesoş");
        String str2 = new String ("Nesoş");

        /*
        == atama operatorü str1 ve str2 objelerinin adreslerinin eşitliğine bakar.
         */
        if (str1 == str2) {
            System.out.println ("yeap");
        } else {
            System.out.println ("no");
        }

        /**
         * new ile OLUŞTURULMAMIŞ String tanımında == atama operatorü içeriğie bakar. adrese bakmaz. aynı objeye refer eder.
         */
        String a1 = "Burak";
        String a2 = "Burak";

        if (a1 == a2) {
            System.out.println ("yeap");
        } else {
            System.out.println ("no");
        }

        String b1 = "Morning koo org";
        System.out.println ("Morning" == b1);

        String c1 = new String ("Morning");
        System.out.println ("Morning" == c1);

        /**
         * String ifadleri birbirine bağlayan + operatorü
         */
        String lang = "Java";
        lang += " is everywhere";
        System.out.println (lang);

        /**
         * + operatorü kullanımında null ifade yoktur.
         * Null olarak işaretlesen bile stringin sonuna null yazar
         */
        String initializedToNull = null;
        initializedToNull += "Java";
        System.out.println (initializedToNull);  //--> nullJava

        /**
         * + operatorü sayı olarak ekler.
         * Ancak karşısına Stirng bir dğeer çıktığı andan sonraki sayısal verileri string olarak birbirine bağlar
         */
        System.out.println (25 + 2 + "Sun" + 4 + 5);

        /**
         Atama	=	x = y	y’nin değerini x’e ata
         Topla-ata	+ =	x + = y     	x + y’nin değerini x’e ata
         Çıkar-ata	– =	x – = y	        x – y’nin değerini x’e ata
         Çarp-ata	* =	x * = y	        x * y’nin değerini x’e ata
         Böl-ata	/ =	x / = y	        x / y’nin değerini x’e ata
         Kalanını ata 	% =	x % = y	    x % y’nin değerini x’e ata
         */


        // string tanımlanması
        // Bir metin değerini İnternet bağlantısı ya da başka bir akış (Stream) üzerinden yollamak istersek
        // byte değerine çevirmemiz gerekebilir. Bir String içerisindeki her harfin byte değerini hesaplayıp
        // String'i byte dizisine çeviren metod getBytes metodudur
        String myString = "Merhaba dünya";
        byte[] strByte = myString.getBytes ();
        System.out.println (new String (strByte));


    }
}
