package stringKullanimi;

/**
 * Created by Universal on 1/9/2020.
 */
public class ParseVeValueOfFarki {

    public static void main(String[] args) {
        /**
         * Parse dönüşünde primitive tip verir.
         * ValueOf ise referance değer verir.
         * Bu hız açısından faydalı olur. biri stackte biri heapte saklanıyor sonuçta. Stackte saklanan veriye ulaşım daha kolaydır.
         */
        String sayi = "10";
        Integer integer1 = Integer.valueOf(sayi);
        int integer2 = Integer.parseInt(sayi);
        System.out.println(integer1 == integer2);

        /**
         * Interger yapılarda javanın cache leme mantığı vardır.
         * Java integer değerlerde -128 ile 127 arasındaki integer değerleri cache alır.
         * Bu iki aralık olmasını sebbei en çok kullanılan aralık olmasından dolayı.
         * Bu değeri geçince farklı nesneler olarak oluşturur.
         */
        Integer s = 128;
        Integer s2 = 128;
        System.out.println(s == s2);//false

        /**
         * Integer 2147483647 ile -2147483648 arası değer almaktadır.
         * Bu değer sınırını aştığınız anda tekrar sıfırlanıp -2147483648 değerinin üzerine saymaya başlar.
         */
        int max_int = Integer.MAX_VALUE;
        System.out.println(max_int);
        int min_int = Integer.MIN_VALUE;
        System.out.println(min_int);
        for (int i = 0; i < 100; i++) {
            max_int++;
            System.out.println(max_int);
        }
    }
}
