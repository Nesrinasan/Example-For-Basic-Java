package exceptionhandling;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Universal on 12/7/2019.
 */
public class test3 {
    public static void main(String[] args) {
        String deger = null;

        try {
            List<Integer> integerList = Arrays.asList(2, 5, 45);
            integerList.get(5);
            deger.substring(1);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dizi uzunluğunu aştı");
//            throw new RuntimeException();
        }catch (NullPointerException e){
            System.out.println("Lütfen değer alanını doldurunuz");
//            throw new RuntimeException();
        }
        System.out.println("Hata yok");

    }
}
