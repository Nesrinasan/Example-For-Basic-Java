package dizilervelisteler;

/**
 * Created by Universal on 9/30/2018.
 */
public class Ogrenci {

    String name;

    public Ogrenci(String name) {
        this.name = "Jan";

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ogrenci) {
            Ogrenci ogrenci = (Ogrenci) obj;
            boolean equals = ogrenci.name.equals (this.name);
            return equals;

        } else {
            return false;
        }

    }
}
