package stringKullanimi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nesrin ÜLGAY on 10/13/2018.
 */
public class StringNesnelerininHafizaKullaniminiAzaltmasi {

    /** String deduplication:
     *
     * String immutable bir yapı olduğu için üzerinde değişiklik yapılamaz.
     * Değişiklik yapıldığı durumda yeni bir String nesnesi oluşturmaktadır.
     * String'in bu kullanımından dolayı hafızada aşırı şişmeler meydana gelmektedir.
     * Java 8'de GC yapısında yapılan bir düzenleme ile bu sorunu minimuma indirecek bir yapı tasarlandı.
     *  -Xmx128m -XX:+UseG1GC -XX:+UseStringDeduplication  Bu iki JVM parametrelerini kullanabilriz.
     *  Her string nesnesinin harfleri value[] nesnesi içerisinde saklanır. Bu parametreler sayesinde bu value[] değerleri içerisinde
     *  aynı olan nesneler tek bir String nesnesinde referans edilecek şekilde yeniden yapılandırılır.
     *  Bir sonrasi GC çalıştığında ise zayıf olan referanslar silinecektir.
     *  Böylece hafızadan büyük oranda tasarruf edilmiş olacaktır.
     *  Bu JVM parametrelerine -XX:+PrintStringDeduplicationStatistics  bunu ekleyerek GC analizinide görebiliriz.
     *
     */
    private static final List<String> STRING_LIST =
            new ArrayList<> ();

    public static void main(String[] args) {
        int iteration = 0;

        while (true) {

            for (int i = 0; i < 10; i++) {

                for (int j = 0; j < 10000; j++) {
                    STRING_LIST.add(new String("Test String " + j));
                }
            }
            iteration++;
            System.out.println("Iterasyon sayisi: " + iteration);
            try {
                /**
                 * G1 genç String’lere “deduplication” işlemini uygulamaz.
                 * Bu en iyi optimizasyon için Kodda Thread yapısı kullanılmıştır. Yani G1'e deduplication fırsatı vermek için.
                 *  Dedublication yükünü azaltmak için kullanabileceğimiz bir parametre de var:
                 * -XX:StringDeduplicationAgeThreshold.
                 * Değerini artırarak bu en iyilemeyi ancak yaşlı olan String’lere uygulanması sağlanabilir. Varsayılan değeri 3’dü
                 */
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }

}
