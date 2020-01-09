package Java8LamdaExp;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Universal on 1/8/2020.
 */
public class IntStreamLongStreamKullanimi {

    public static void main(String[] args) {
//        IntStream range = IntStream.range(1, 100);
//        /**
//         * 1 ile 100 arasındaki en fazla 15 değeri al
//         */
//        range.forEach(System.out::println);
//        boolean b = range.limit(15).anyMatch(value -> value == 5);
//        System.out.println(b);


        boolean match = IntStream.range(1, 5)
                .filter(i -> i % 2 == 0)
                .allMatch(i -> i % 2 == 0);
        System.out.println(match);

        /**
         * sıralama
         */
        List<Integer> integerList = Arrays.asList(85,12,63,45,11,2);
        Stream<Integer> sorted = integerList.stream().sorted();
        sorted.forEach(System.out::println);
    }

}
