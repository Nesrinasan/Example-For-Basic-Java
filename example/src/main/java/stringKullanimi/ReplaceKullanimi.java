package stringKullanimi;

/**
 * Created by Nesrin ÜLGAY on 8/13/2018.
 */
public class ReplaceKullanimi {

    public static void main(String[] args) {

        /**
         * Replace()
         * karakter türünden veya grup türünden verileri değiştirir.
         * Char olarak verdiğin bir değeri grup olarak değiştiremezsin. Compile time hatası alır.
         *   System.out.println (letter.replace ("B", 'b'));  bu durum hata verecektir.
         *
         */

        String letter = "ABCAB";
        System.out.println (letter.replace ('B', 'b'));
    }

}
