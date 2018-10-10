package parametreKullaimi;

/**
 * Created by Nesrin ÜLGAY on 3/5/2018.
 */
public class ParametreKullanimi {

    public int daysOffWork(int... days) {
        int daysOff = 0;

        for (int i = 0; i < days.length; i++) {
            daysOff += days[i];

        }
        return daysOff;
    }
}

class Test {
    public static void main(String[] args) {
        ParametreKullanimi parametreKullanimi = new ParametreKullanimi ();
        int ilk = parametreKullanimi.daysOffWork (1, 2, 3);
        int ikinci = parametreKullanimi.daysOffWork (1, 2, 3, 4, 5);
        System.out.println (ilk);
        System.out.println (ikinci);

    }

}
