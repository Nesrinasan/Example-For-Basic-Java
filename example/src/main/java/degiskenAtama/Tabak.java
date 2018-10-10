package degiskenAtama;

/**
 * Created by Nesrin ÜLGAY on 9/27/2018.
 */
public class Tabak {

    public Tabak(int i, String tur) {
        System.out.println("Tabak ("+i+") -->" + tur);
    }

    public Tabak() {
        System.out.println("Okey");
    }

    static Peynir p1 = new Peynir(1,"statik degisken");
    Peynir p2 = new Peynir(2,"statik-olmayan degisken");
}
