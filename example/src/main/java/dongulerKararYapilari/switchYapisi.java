package dongulerKararYapilari;

import dizilervelisteler.Ogrenci;

/**
 * Created by Universal on 11/26/2018.
 */
public class switchYapisi {

    /**
     * Switch yapısı çoklu veri kontrolünde if, else yapısına göre çok daha okunaklı ve takibi rahattır.
     * Switch statement'inin kabul edebileceği paramtereler :char, byte, sort, int, String(java 7 ile kabul etmeye başladı)
     * Aynı zamanda enum, Characker, Byte, Integer, Sort
     * Switch yapısının kabul etmediği parametreler : long, float, double ve String dışında herhangi bir nesne
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Aşağıdaki kod hata verir. compile-time error
         */
//        double deger = 20;
//        switch (deger){
//
//        }

        String string = "nesrn";
        switch (string){

        }

        /**
         * String dışındaki nesneleri kabul etmez.
         */
//        Ogrenci ogrenci = new Ogrenci ("");
//        switch (ogrenci){
//
//        }


        /**
         * case olarak b+c hata verir çünkü case dğeerinde sonradan değişen değerleri önlemek için compile time sırasında hata veirr.
         * b+c olarak dğeişken tanımlayabilmek için final olarak işaretleyebiliriz verilerimizi.
         */
        int a =5;
        final int b=10;
        final int c= 15;

        switch (a){
            case b+c:
                System.out.println ("note");
            case 7-5:
                System.out.println ("note2");
        }

        /**
         * final olarak declare edilen bir değişken declare edildiği anda initialized edilmemişse yine compile-time hatası fırlatacaktır.
         */

//        int s =5;
//        final  int d=10;
//        final  int f=15;
//        f= 15;
//
//        switch (s){
//            case d+f:
//                System.out.println ("note");
//            case 7-5:
//                System.out.println ("note2");
//        }
    }
}
