package exceptionhandling;

import model.Sinif;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Universal on 12/7/2019.
 */
public class outputSorulari {
    static int deger ;

    public static void main(String[] args) {
//        metot();

//        deger = metot2();
//        System.out.println("metot2 sonucu değeri : " + deger);

//        StringBuilder deger = metot3();
//        System.out.println("metot2 sonucu değeri : " + deger);

//        int sonuc = metot4();
//        System.out.println(sonuc);

//        JavaBase javaBase = new JavaDerived();
//        javaBase.method();

//        metot5();

//        metot6();

//        metot7();

//        metot8();

//        metot9();
    }

    private static void metot9() {
        Sinif sinif = new Sinif();
        sinif.adi = "10C";

        Sinif sinif1 = new Sinif();
        sinif1.adi = "11D";

        sinif = sinif1;
        System.out.println(sinif.adi);
        System.out.println(sinif1.adi);

    }

    private static void metot8() {
        Sinif sinif = new Sinif();
        System.out.println("Sınıf adı " + sinif.getAdi() + " Öğrenci sayısı" + sinif.getOgrenciSayisi() + "Zemin katta mı? " + sinif.isZeminKattaMi());
    }

    private static void metot7() {
        int a = 0;
        while (a == a++) {
            a++;
            System.out.println(a);
        }
    }

    private static void metot6() {
        int a = 5;
        int d = 5;

        int b = a++;
        int c = ++d;

        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        System.out.println(d);
    }

    private static void metot5() {

        try {
            String s = null;
            System.out.println("1");
            try {
                System.out.println(s.length());
            } catch (NullPointerException e) {
                System.out.println("içerideki catch bloğu");
            }
            System.out.println(2);
        } catch (NullPointerException e) {
            System.out.println("dışarıdaki catch bloğu");
        }
    }

    private static int metot4() {
        int a = 10;
        try {
            ++a;
            System.out.println("ilk a" + ++a);

        } finally {
            System.out.println("ikinci a" + a++);
            a++;
        }
        return a;
    }

    private static int metot2() {
        int deger = 10;
        try {
            String[] dizi = {"NEsrin", "Doruk"};
            System.out.println(dizi[3]);
        } catch (Exception e) {
            System.out.println("deger : " + deger);
            return deger;
        } finally {
            deger += 10;
            System.out.println("finally bloğundaki değer" + deger);
        }
        return deger;

    }

    private static StringBuilder metot3() {
        StringBuilder deger = new StringBuilder("10");
        try {
            String[] dizi = {"NEsrin", "Doruk"};
            System.out.println(dizi[3]);
        } catch (Exception e) {
            System.out.println("deger : " + deger);
            return deger;
        } finally {
            deger.append(10);
            System.out.println("finally bloğundaki değer" + deger);
        }
        return deger;

    }

    private static void metot() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Dosya.txt");
            System.out.println("Dosya açıldı");
            fileInputStream.read();
            System.out.println("Dosya okundu");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Dosya yok");
            //return ne sonucç verir
            return;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Dosya okunamadı");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Diğer dosyayı oku");
    }


}
