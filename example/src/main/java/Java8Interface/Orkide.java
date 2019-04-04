package Java8Interface;

/**
 * Created by Nesrin Aşan on 4/4/2019.
 */
public class Orkide{

    /**
     * Ibitki interface i kullanılarak fonksiyonel arayüz tasarımı yapabiliyoruz.
     * Burada dikkat edilmesi gereken nokta IBitki sınıfının fonksiyonel bir arayüz olabilmesi için
     * bir adet gövdesiz metot alması gerekiyor. Bunun yanında birden çok gövdeli metot alabilir.
     * Aşağıda örneklemesi bulunduğu gibi..
     */
    public Orkide(){
        IBitki bitki = ()-> System.out.println("Orkide sulanıyor");
        bitki.fotosentezYap();
    }
}
