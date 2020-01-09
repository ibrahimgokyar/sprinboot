package com.altay.altayspringboot.entity;

import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="Kisi")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Kisi  extends BaseEntity{
    //@JsonIgnore   bazen id yi göndermek isteyebilirim bazen de dış dünyanın görmesisini istemeyebilirim
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="ad",length = 50)
    private String ad;
    @Column(name="soyad",length = 50)
    private String soyad;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
