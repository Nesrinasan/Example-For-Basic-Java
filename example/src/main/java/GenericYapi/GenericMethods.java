package GenericYapi;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nesrin Aşan on 1/27/2020.
 */
public class GenericMethods {

    public static void main(String[] args) {
        List<String> isimList = Arrays.asList("Nesrin", "Burak", "Doruk");
        List<Integer> integerList = Arrays.asList(1, 10, 250);
        String stringElement = getElement(isimList);
        Integer intElement = getElement(integerList);

        System.out.println(stringElement);
        System.out.println(intElement);
    }

    public static <T> T getElement(List<T> list) {//<T> -> bu hangi tip geleceğini belitrir. yanındaki T ise dönüş tipini belirtir.
                                                    //Eğer Classtipini generic (yani GenericMethods<T>) oluşturursak metot üzerinde tekrar generic(yani <T>) yapmaya gerek kalmaz.
        for (T t : list) {
            System.out.println(t);
        }
        return list.get(0);
    }
}
