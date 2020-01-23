package model;

import java.util.List;

/**
 * Created by Universal on 1/18/2020.
 */
public class Personel {

    private String adi;
    private Long yasi;
    private List<Adres> adress;

    public Personel(String adi, Long yasi){
        this.adi = adi;
        this.yasi = yasi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Long getYasi() {
        return yasi;
    }

    public void setYasi(Long yasi) {
        this.yasi = yasi;
    }

    public List<Adres> getAdress() {
        return adress;
    }

    public void setAdress(List<Adres> adress) {
        this.adress = adress;
    }
}
