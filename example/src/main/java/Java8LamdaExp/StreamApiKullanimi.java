package Java8LamdaExp;

import model.Staff;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Universal on 1/8/2020.
 */
public class StreamApiKullanimi {

    public static void main(String[] args) {
        List<String> adList = Arrays.asList("Nesrin", "Burak", "Doruk", "Fırat");
        /**
         * Listenin elemanlarını yazdır.
         */
        adList.stream().forEach(System.out::println);

        /**
         * Filtreleme
         */
//        List<String> isimYeniList = adList.stream().filter(s -> s.equals("Nesrin")).collect(Collectors.toList());
//        isimYeniList.stream().forEach(System.out::println);
//        //veya
//        adList.stream().filter(s -> s.equals("Burak")).forEach(System.out::println);


        /**
         * java 8 de stream yapısı tek kullanımlık olacak şekilde tasarlanmıştır.
         * Bu nedenle aşağıdaki gibi bir kod yazdığınız zaman aynı "stream" üzerinde iki adet işlem yapılmış olacaktır.
         * Bunun için birkaç çözüm var.
         */
//        Stream<String> stream = adList.stream();
//        Optional<String> first = stream.findFirst();
//        Optional<String> any = stream.findAny();

        /**
         * ilk olarak aynı stream üzerinden devam edersiniz işlerinize.
         * Aşağıda belirtilmiştir.
         */
        Optional<String> first1 = adList.stream().findFirst();
        Optional<String> any1 = adList.stream().findAny();

        /**
         * Veyahut her seferinde yeni bir akış oluşturmamız gerekiyor.
         * Aşağıda örneği var.
         */

        Supplier<Stream<String>> streamSupplier = () -> adList.stream();

        Optional<String> first2 = streamSupplier.get().findFirst();
        Optional<String> any2 = streamSupplier.get().findAny();


        /**
         * Stream veri ekleme, dizi olarak vs.
         */
        //1
//        Stream<Integer> streams = Stream.of(1,2,3,4,5,6,7,8,9);
//        streams.forEach(System.out::println);
//        //2
//        Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
//        //3
//        List<Integer> list = new ArrayList<Integer>();
//        for(int i = 1; i< 10; i++){
//            list.add(i);
//        }
//        //4
//        Integer[] evenNumbersArr = list.stream().filter(i -> i%2 == 0).toArray(Integer[]::new);
//        Stream<Integer> evenNumbersArr1 = Stream.of(evenNumbersArr);
//        evenNumbersArr1.forEach(System.out::println);


        /**
         * Genel kullanımlar
         */
        List names = Arrays.asList("Ali", "Veli", "Selami", "Veli", "Selami", "Can", "Hüseyin");

        List listName = (List) names.stream().collect(Collectors.toList());
        listName.stream().forEach(System.out::println);

        System.out.println("-------------------------------Set Kullanımı-------------------------------");
        Set set = (Set) names.stream().collect(Collectors.toSet());
        set.stream().forEach(System.out::println);

        System.out.println("-------------------------------Count Kullanımı-------------------------------");
        Long count = (Long) names.stream().collect(Collectors.counting());
        System.out.println(count);

        System.out.println("-------------------------------Joining Kullanımı-------------------------------");
        String collect = (String) names.stream().collect(Collectors.joining(" - "));
        System.out.println(collect);


        List<Staff> staffList = Arrays.asList(
                new Staff("mkyong", 15, new BigDecimal(10000)),
                new Staff("mkyong", 10, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );

        Map<String, List<Staff>> stringListMap = staffList.stream().collect(Collectors.groupingBy(o -> o.getAd()));
        stringListMap.forEach((s, staff) -> System.out.format( "adı %s: %s\n", s, staff));
        /**
         * Key'i bulmak için aşağıdaki gibi kod yazabilriiz.
         */
        Stream<String> stringStream = stringListMap.entrySet().stream().map(Map.Entry::getKey);
        stringStream.forEach(System.out::println);

        /**
         * key almak için aşağıdaki yöntemde kullanılabilir.
         */
        stringListMap.keySet().forEach(System.out::println);

    }


}
