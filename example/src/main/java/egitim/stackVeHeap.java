package egitim;

import Java8Interface.Kedi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Universal on 11/30/2019.
 */
public class stackVeHeap {
    static int sayi = -1;

    public static void main(String[] args) {
//        test();
//        heapmemoryError();
//        stringKullanimi();
//        staticHaficaKontrol();
//        System.out.println(factorial(-1));
//        for (int i = 0; i < 10; i++) {
//            String s = new String("nesrin");
//            s.replace('i', 's');
//        }
//        Integer sayi = 5;
//        getDeger(sayi);
//        System.out.println(sayi);

//        Okul okul = new Okul();
//        okul.setSinifSayisi(3);
//        getOkul(okul);
//        System.out.println(okul.getSinifSayisi());

        getList();
    }

    private static void getList() {
        List<String> list = Arrays.asList("Nesrin", "Nesrin", "Nesrin", "Şafak", "Şafak", "Ahmet");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------");
        HashSet<String> isimStringHashSet = new HashSet<>();
        isimStringHashSet.addAll(list);

        for (String s : isimStringHashSet) {
            System.out.println(s);
        }


    }

    private static void getOkul(Okul okul) {
        okul.setSinifSayisi(5);
    }

    public static void getDeger(Integer sayi) {
        sayi++;
    }


    public static void test() {
//        String kelime = "Nesrin";
//        String kelime2 = "Nesrin";
//        System.out.println(kelime == kelime2);

//        Integer sayi1 = new Integer(2);
//        int sayi2 = 2;
//        System.out.println(sayi1 == sayi2);

//        String isim = new String("Nesrin");
//        String isim1 = "Nesrin";
//        if(isim==isim1){
//            System.out.println("Doğru");
//
//        }else{
//            System.out.println("Yanlış");
//        }

//        Integer integer = new Integer(2);
//        Integer integer2= 2;
//        System.out.println(integer == integer2);

//        String  isim = "Nesrin";
//        String isim2 = "Nes" + "rin";
//        System.out.println(isim == isim2);


//        int a = 5;
//        int b = 5;
//        if(a == b){
//            System.out.println("Doğru");
//        }
//
//        Integer integer = new Integer(2);
//        Integer integer2= 2;
//        System.out.println(integer.equals(integer2));

        Integer integer = new Integer(2);
        int integer2 = 2;
        System.out.println(integer == integer2);


//        String a = "Ayşe";
//        System.out.println(a);
//        String b = a;
//        System.out.println(b);
//        a = "Mehmet";
//        System.out.println(a);
//        System.out.println(b);
//
//        int c  = 4;
//        System.out.println(c);
//        int d = c;
//        System.out.println(d);
//        c = 9;
//        System.out.println(c);
//        System.out.println(d);

        /**
         * stackoverfow hatası
         */

//        System.out.println("Main method started");
//        int result = factorial(5);
//        System.out.println("Factorial ==>"+result);
//        System.out.println("Main method ended");

    }

//    public static int factorial(Integer n) {
//        if (n == 1) {
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
//    }

    /**
     * heap memory hatası
     */
    public static void heapmemoryError() {
        List<String> list = new ArrayList<>();

        while (true) {
            String s = new String("NEsrin");
            System.out.println(s);
            list.add(s);
        }
    }

    /**
     * String kullanımı VMden kontrol
     */
//    public static void stringKullanimi() {
//        String isim ="Doruk";
//        String isim =new String("Doruk");
//        for (int i = 0; i < 1000000000; i++) {
//            isim = new String("Doruk");
//            System.out.println(isim);
//        }
//    }
}
