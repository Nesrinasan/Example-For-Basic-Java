package Java8LamdaExp;

import model.Personel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Nesrin Aşan on 1/18/2020.
 */
public class ReduceKullanimi {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nesrin");
        list.add("aşan");

        String reduce = list.stream().reduce("", (x, y) -> x + " " + y);
        System.out.println(reduce);

        int toplam = IntStream.range(0, 10).reduce(0, (x, y) -> x + y);
        System.out.println(toplam);

        Stream.of(toplam).forEach(System.out::println);

        List<Integer> sayiList = Arrays.asList(2, 5, 7, 8);
        Integer sonuc = sayiList.stream().reduce(0, Integer::sum);
        System.out.println(sonuc);

        list.stream().reduce((s, s2) -> s.length() < s2.length() ? s : "yok").ifPresent(System.out::println);

        int carpimSonucu = IntStream.range(1, 8).reduce(1, Math::multiplyExact);
        System.out.println(carpimSonucu);


        /**
         * Elimizde Person sınıfı türünden 5 nesne bulunsun. Bu 5 nesne içinden tüm kişilerin yaşlarının ortalamasını hesaplamak isteyelim.
         */
        List<Personel> personelList = Arrays.asList(new Personel("Ayşe", null),
                new Personel("Ahmet", 20L), new Personel("Mehmet", 52L), new Personel("Murat", 24L), new Personel("Canan", 15L));

        Long ortalamaYas = personelList.stream()
                .filter(personel -> personel.getYasi() != null)
                .map(personel -> personel.getYasi())
                .reduce(0L, (aLong, aLong2) -> (aLong + aLong2) / 2);//dizinin size'ı kadar bölme yapılamaz. Çünkü her işlemde iki sayı toplanıyor.
        System.out.println(ortalamaYas);

    }
}