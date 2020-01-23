package Java8LamdaExp;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Universal on 1/8/2020.
 */
public class IntStreamLongStreamKullanimi {

    public static void main(String[] args) {
        IntStream range = IntStream.range(1, 100);
        /**
         * 1 ile 100 arasındaki en fazla 15 değeri al
         */
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
//        List<Integer> integerList = Arrays.asList(85,12,63,45,11,2);
//        Stream<Integer> sorted = integerList.stream().sorted();
//        sorted.forEach(System.out::println);


        /**
         * MaptoObje ile integer ve string bir arada kullanılabilir.
         */
        IntStream.range(0,10).mapToObj(value -> "sayı : " + value).forEach(System.out::println);

        Arrays.stream(new int[] {1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

        Stream<String> stringStream = Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    if(s.equals("a2")){
                        return false;
                    }else{
                        return true;

                    }
                });

        stringStream.forEach(System.out::println);

        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: " + s));
        /**
         * Önemli: Normalde bir veriyi girdiği gibi çıktısının oluşmasını bekleriz
         * Ancak burada tek tek işlenir bütün veriler yani çıktısı :
         * //
         // map:     d2
         // filter:  D2
         // map:     a2
         // filter:  A2
         // forEach: A2
         // map:     b1
         // filter:  B1
         // map:     b3
         // filter:  B3
         // map:     c
         // filter:  C

         Bu şekilde oluşur.
         */

    }

}
