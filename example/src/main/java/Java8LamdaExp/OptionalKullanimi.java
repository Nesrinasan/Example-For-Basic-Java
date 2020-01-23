package Java8LamdaExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Universal on 12/16/2019.
 */
public class OptionalKullanimi {

    public static void main(String[] args) {

        /**
         *
         empty:
         Taze bir Optional nesnesi oluşturur.
         of:
         Bir nesneyi Optinal ile sarmalar. Parametre olarak null değer kabul etmez.
         ofNullable:
         Bir nesneyi Optinal ile sarmalar. Parametre olarak null değer kabul eder.
         */
        Integer numara = null;

        Optional<Integer> opt = Optional.ofNullable(numara);

        opt.ifPresent(num -> {
            Double karesi = Math.pow(num, 2);
            System.out.println("Sonuç: " + karesi);
        });


        Integer sayi = null;

        Optional<Integer> numara1 = Optional.ofNullable(sayi);//of null kabul etmediği için alt satıra geçmeden patlar.
        //Eğer ofnullable yaparsam null kabul edeceği için isPresent metodu ile işlemlerimi yönlendirebilriim.
        boolean present = numara1.isPresent();
        System.out.println(present);

        String isim = "Nesrin";
        Optional<String> stringOptional = Optional.ofNullable(isim);
//        stringOptional.ifPresent(s -> {
//            if(s.length() > 7){
//                System.out.println(s.length());
//            }else{
//                System.out.println("isimin değeri 7 den küçük");
//            }
//        }); //ifPrsent : Değer var ise ne işlem yapmak istiyorsan onu yap.

        String yeniString = stringOptional.orElse("isim kelimesi null ise buradaki değeri al");
        //orElse: Eğer değer içi boş ise ne yapılmak istenildiğinin yazılacağı metot.
        System.out.println(yeniString);


        List<String> names = Arrays.asList("Ali", "Veli", "Selami");
        Optional<List<String>> opts = Optional.ofNullable(names);
        names = opts.orElseGet(() -> new ArrayList()); //orElse den farkı: Supplier arayuzune sahip dönüş değeri alır.
        //yani orElseGet metodu başka bir metot çağrımında bulunabilir.Öğrneğin

        names = opts.orElseGet(ArrayList::new);


        String soyisim = null;
        Optional<String> optIsim = Optional.ofNullable(isim);
        Optional<String> optional = optIsim.filter(s -> s.equals("nesri"));
        optional.ifPresent(System.out::println);


    }
}
