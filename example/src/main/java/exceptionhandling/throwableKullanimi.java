package exceptionhandling;

import egitim.Ogretmen;
import egitim.Okul;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Universal on 12/7/2019.
 */
public class throwableKullanimi {
    public static void main(String[] args) throws Exception {
        dosyaVerileri();
        setOkulBilgileri();
        setOgretmenBilgileri();
    }


    private static void dosyaVerileri() throws Exception {
        FileInputStream inputStream = new FileInputStream("C://toadimport.txt");
    }

    private static void setOkulBilgileri() {
        Okul okul = null;
        okul.setAdi("MehmetAkif");

    }

    private static void setOgretmenBilgileri() {
        Ogretmen ogretmen = null;
        ogretmen.setAdi("Ahmet");
    }
}