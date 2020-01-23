package Java8LamdaExp;

import model.Staff;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Universal on 1/15/2020.
 */
public class SortedKullanimi {
    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList(
                new Staff("Nesrin", 15, new BigDecimal(10000)),
                new Staff("Doruk", 10, new BigDecimal(20000)),
                new Staff("Burak", 33, new BigDecimal(30000))
        );


        /**
         * sıralama sorted (küçüktne büyüğe sıralama yapar.)
         */
        staff.stream().sorted(Comparator.comparing(staff1 -> staff1.getYas())).collect(Collectors.toList()).forEach(System.out::println);

        //büyükten küçüğe sıralama
        staff.stream().sorted(((o1, o2) -> o2.getYas().compareTo(o1.getYas()))).collect(Collectors.toList()).forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ahmet");
        map.put(2, "Mehmet");
        map.put(3, "Fatma");
        map.put(4, "Can");

        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).map(Map.Entry::getKey).collect(Collectors.toList()).forEach(System.out::println);

    }
}
