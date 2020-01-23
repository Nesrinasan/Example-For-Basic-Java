package model;

import java.math.BigDecimal;

/**
 * Created by Universal on 1/10/2020.
 */
public class Staff {
    String ad; Integer yas; BigDecimal maas;
    public Staff(String ad, Integer yas, BigDecimal maas){
        this.ad = ad;
        this.maas = maas;
        this.yas = yas;

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public BigDecimal getMaas() {
        return maas;
    }

    public void setMaas(BigDecimal maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return ad;
    }
}
