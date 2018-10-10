package degiskenAtama;

/**
 * Created by Nesrin ÜLGAY on 9/27/2018.
 */
public class DegiskenAtama {

    static Catal  c1 = new Catal(1,"statik degisken");

    public DegiskenAtama() {
        System.out.println("DegiskenAtama() yapilandirici metod");
    }

    Tabak t1 = new Tabak(1,"statik-olmayan degisken");
    public void islemTamam() {
        System.out.println("Islem tamam");
    }

    static Catal  c2 = new Catal(2,"statik degisken");

    public static void main (String args[]  ) throws Exception {
        DegiskenAtama d = new DegiskenAtama();
        d.islemTamam();
    }

    static Tabak t4 = new Tabak(4,"statik degisken");

    /**
     * static değişkenlere bir defa değer verilir.
     * ikinci kez bu classa girdiği zaman nesne üzerindeki static değişkenin değeri değişmemiş olacaktır.
     */
    static Tabak t5 = new Tabak(5,"statik degisken");
}