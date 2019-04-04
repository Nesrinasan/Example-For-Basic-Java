package Java8Interface;

/**
 * Created by Nesrin Aşan on 4/4/2019.
 */
public interface ICanli {

    default void beslenir(){
        System.out.println("Bitki Beslenir");
    }
    /**
     * static yazdığımız metodu direkt interface üzerinden çağırabilriiz.
     * ICanli.nefesAl();
     * static yazılan metotlar kendisini implement eden classlar üzerinde overried edilmez. compiletime hatası alır.
     */
    static void nefesAl(){
        System.out.println("canlı nefes alır");
    }

}
