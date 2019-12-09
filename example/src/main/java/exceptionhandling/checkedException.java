package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Universal on 12/7/2019.
 */
public class checkedException {

    public static void main(String[] args) {
        /**
         * checked exception : Derleyici tarafından zorunlu olarak try- catch bloğuna alınması gerektiği söylenir.
         */
        try {
            FileInputStream inputStream = new FileInputStream("toadimport.txt");
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
