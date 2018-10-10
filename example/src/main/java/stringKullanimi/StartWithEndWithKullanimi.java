package stringKullanimi;

/**
 * Created by Nesrin ÜLGAY on 8/13/2018.
 */
public class StartWithEndWithKullanimi {

    public static void main(String[] args) {

        /**
         * StartWith() and EndsWith()
         */

        String letter = "ABCAB";
        System.out.println (letter.replace ('B', 'b'));
        System.out.println (letter.startsWith ("a"));
        System.out.println (letter.startsWith ("A"));

        System.out.println (letter.endsWith ("CAB"));
    }


}
