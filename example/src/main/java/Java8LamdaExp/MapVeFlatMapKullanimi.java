package Java8LamdaExp;

import model.Adres;
import model.Ogretmen;
import model.Personel;
import model.Staff;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Universal on 1/9/2020.
 */
public class MapVeFlatMapKullanimi {
    public static void main(String[] args) {

        /**
         * Map kullanımı.
         */
        List<Staff> staffList = Arrays.asList(
                new Staff("mkyong", 15, new BigDecimal(10000)),
                new Staff("jack", 10, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );

        List<String> collect = staffList.stream().map(o -> o.getAd()).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);

        /**
         * map ile stream içerisinde erişebildiğimiz nesneler üzerinden işlem yapabiliriz.
         * aşağıdaki gibi yeni nesne oluşturup veri çekebiliriz.
         */
        List<Ogretmen> ogretmenList = staffList.stream().map(staff -> {
            Ogretmen ogretmen = new Ogretmen();
            ogretmen.setAdi(staff.getAd());
            return ogretmen;
        }).collect(Collectors.toList());


        staffList.stream().map(staff1 -> {
                    Staff staff2 = null;
                    if (staff1.getYas().compareTo(15) > 0) {
                        staff2 = new Staff("nesrin", 5, new BigDecimal(1000));

                    }
                    return staff2;
                }

        ).collect(Collectors.toList()).forEach(System.out::println);

        Map<String, String> books = new HashMap<>();
        books.put("978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put("978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");

        //keylist
        books.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toList()).forEach(System.out::println);

        //valueList
        books.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList()).forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ahmet");
        map.put(2, "Mehmet");
        map.put(3, "Doruk");
        map.put(4, "Nesrin");

        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).map(Map.Entry::getKey).collect(Collectors.toList()).forEach(System.out::println);
        map.forEach((k,v) ->{
            System.out.println(k +" : " +v);
        });

        /**
         * Map içeirisndeki değerleri alır
         */
        Stream<String> stream = map.values().stream();
        stream.forEach(System.out::println);

        /**
         * Map içerisindeki keyleri alır
         */
        Stream<Integer> streamKeySet = map.keySet().stream();
        streamKeySet.forEach(System.out::println);


        /**
         * FlatMap
         * flatMap ile yeni bir stream oluşturup devam ederiz.
         * Yani personel üzerindeki "adı" alanı ile ilgili işlem yapmak istersek map kullanırız.
         * Ama personel üzerindeki adres listesi üzerindeki il alanı ile ilgili işlem yapmak istersek flatmap kullanıp
         * yeni bir stream'e dönüştürüp, her bir elemana map ile erişebiliriz.
         *
         */
        Personel p1 = new Personel("sinan", 33L);
        Personel p2 = new Personel("metin", 62L);
        Personel p3 = new Personel("semih", 43L);
        Personel p4 = new Personel("ali", 9L);

        p1.setAdress(
                Arrays.asList(
                        new Adres("Istanbul", "Levent"),
                        new Adres("Istanbul", "Sisli")));

        p2.setAdress(
                Arrays.asList(
                        new Adres("Istanbul", "Kadikoy"),
                        new Adres("Istanbul", "Bebek")));

        p3.setAdress(
                Arrays.asList(
                        new Adres("Istanbul", "Levent"),
                        new Adres("Istanbul", "Kadikoy")));

        p4.setAdress(
                Arrays.asList(
                        new Adres("Istanbul", "Beykoz"),
                        new Adres("Istanbul", "Kadikoy")));

        List<Personel> PersonelList = Arrays.asList(p1, p2, p3, p4);
        PersonelList.stream()
                .filter(p -> p.getYasi() > 30)
                .flatMap(personnel -> personnel.getAdress().stream())
                // .map(Address::getIl)
                .map(adres -> adres.getIl())
                .distinct()
                .collect(Collectors.toList()).forEach(System.out::println);


    }
}
