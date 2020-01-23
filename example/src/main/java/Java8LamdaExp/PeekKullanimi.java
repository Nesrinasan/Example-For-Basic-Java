package Java8LamdaExp;

import model.Personel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Universal on 1/22/2020.
 */
public class PeekKullanimi {
    public static void main(String[] args) {
        Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
        Stream<String> peek = nameStream.peek(System.out::println);// console birşey yazmaz. foreach'ten farklı olarak peek sonrası başka stream işlemleri yapılabilir.
        peek.filter(s -> s.startsWith("B")).forEach(System.out::println);


        nameStream.peek(System.out::println)
                .filter(s -> s.startsWith("B"))
                .map(s -> "Kişinin ismi: " + s)
                .forEach(System.out::println);

        final List<String> strings
                = Stream.of("one", "two", "three", "four")
                .peek(e -> System.out.println("Original Element: " + e))
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println("Final Results: " + strings);//Java doc. peek metodunun daha çok debugging işlemlerinde kullanıldığını belirtir.

        nameStream.peek(person -> System.out.println(person))
                .map(String::toUpperCase)
                .peek(person -> System.out.println(person))
                .collect(Collectors.toList());
        System.out.println("People: " + nameStream);

    }
}
