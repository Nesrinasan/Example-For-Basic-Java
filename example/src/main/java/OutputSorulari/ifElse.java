package OutputSorulari;

import java.util.ArrayList;

/**
 * Created by Universal on 11/26/2018.
 */
public class ifElse {


    /**
     * Kodun çıktısı ne olur?
     * @param args
     */
    public static void main(String[] args) {

        String result = "1";
        int score = 10;
        if((score = score +10) ==100){
            result ="A";
        }else if((score = score + 29) == 50){
            result = "B";
        }else if((score = score +200) == 10){
            result = "C";
        }else {
            result = "F";
        }
        System.out.println (result + " :" + score);


        boolean allow = false;
        if(allow = true){
            System.out.println ("izin verildi");
        }else{
            System.out.println ("isin verilmedi");
        }

        if(allow == true){
            System.out.println ("izin verildi");
        }else{
            System.out.println ("isin verilmedi");
        }

        int a = 2; int b = 3; int c = ++b; int d = a++;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("d : " + d);


        /**
         * çıktısı ?
         */
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ahmet");
        list.add("Ozan");
        list.add("Eda");
        list.add("Ahu");

        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }

        for (String str : list) {
            System.out.println(str);
        }

        /**
         * çıktı?
         */

        int h = 0;

        while (h < 10) {
            System.out.println(h);

            if (h * 2 == 10)
                break;
            h++;
        }

        /**
         * çıktı
         */
        int toplam = 0;
        int i;

        for (i=0; i<5; i++) {
            if(i == 3)
                break;
            toplam += i;
        }
        System.out.println("toplamt"+ toplam);

        /**
         * çıktı?
         */
        int[] int_array = new int[31];

        for (i=0; i<30; i++) {
            int_array[i] = i + 1;
        }

        System.out.println(int_array[30]);

        /**
         * çıktı
         */

        for ( i = 0; i < 5; i++) {
            switch (i) {
                case 0 :
                    System.out.println("Ahmet");
                    break;
                case 1 :
                    System.out.println("Ayse");
                case 2 :
                    System.out.println("Hakan");
                    break;
                default :
                    System.out.println("isim yok");
                    break;
            }
        }
        /**
         * çıktı?
         */
        Integer f = new Integer(1);
        Integer k = new Integer(1);
        System.out.println(f == k);


        /**
         * çıktı
         */
        int as = 1;
        int bs = as == 1 ? 1 : 0;

        System.out.println(as * bs);

        /**
         * çıktı
         */
        int[] array1 = new int[10];
        int[] array2 = {1,2,3,4};

        System.out.println(array1.length * array2[2]);


        /**
         * çıktı?
         */
        ifElse box = new ifElse (2,5);
        box.area();

    }

    private int a;
    private int b;
    public ifElse(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("a : " + a + " b : " + b);
    }

    public void area() {
        System.out.println(a * b);
    }
}




