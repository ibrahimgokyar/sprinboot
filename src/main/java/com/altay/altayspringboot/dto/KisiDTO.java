package com.altay.altayspringboot.dto;


import lombok.Getter;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;

// Veritabanımdaki tablodaki tüm colonları dış dünyaya ile paylaşmak istemeyebilirim

public class KisiDTO {

    private String ad;
    private String Soyad;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }
}
