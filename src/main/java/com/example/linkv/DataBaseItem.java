package com.example.linkv;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DataBaseItem {
    @Id
    private String name_punk;
    private String name_przed;
    private String miejs;
    private String ulic;
    private String nr_bud;
    private String typ_punk;
    private String nr_lok;
    private String adr_opis;

    public DataBaseItem(String name_punk, String name_przed, String miejs, String ulic,
                        String nr_bud, String typ_punk, String nr_lok, String adr_opis) {
        this.name_punk = name_punk;
        this.name_przed = name_przed;
        this.miejs = miejs;
        this.ulic = ulic;
        this.nr_bud = nr_bud;
        this.typ_punk = typ_punk;
        this.nr_lok = nr_lok;
        this.adr_opis = adr_opis;
    }

    public DataBaseItem(String name_punk, String name_przed, String miejs, String ulic,
                        String nr_bud, String typ_punk, String nr_lok) {
        this.name_punk = name_punk;
        this.name_przed = name_przed;
        this.miejs = miejs;
        this.ulic = ulic;
        this.nr_bud = nr_bud;
        this.typ_punk = typ_punk;
        this.nr_lok = nr_lok;
    }

    public DataBaseItem(String name_punk, String name_przed, String miejs, String ulic,
                        String nr_bud, String typ_punk) {
        this.name_punk = name_punk;
        this.name_przed = name_przed;
        this.miejs = miejs;
        this.ulic = ulic;
        this.nr_bud = nr_bud;
        this.typ_punk = typ_punk;
    }

    public String getName_punk() {
        return name_punk;
    }

    public void setName_punk(String name_punk) {
        this.name_punk = name_punk;
    }

    public String getName_przed() {
        return name_przed;
    }

    public void setName_przed(String name_przed) {
        this.name_przed = name_przed;
    }

    public String getMiejs() {
        return miejs;
    }

    public void setMiejs(String miejs) {
        this.miejs = miejs;
    }

    public String getUlic() {
        return ulic;
    }

    public void setUlic(String ulic) {
        this.ulic = ulic;
    }

    public String getNr_bud() {
        return nr_bud;
    }

    public void setNr_bud(String nr_bud) {
        this.nr_bud = nr_bud;
    }

    public String getTyp_punk() {
        return typ_punk;
    }

    public void setTyp_punk(String typ_punk) {
        this.typ_punk = typ_punk;
    }

    public String getNr_lok() {
        return nr_lok;
    }

    public void setNr_lok(String nr_lok) {
        this.nr_lok = nr_lok;
    }

    public String getAdr_opis() {
        return adr_opis;
    }

    public void setAdr_opis(String adr_opis) {
        this.adr_opis = adr_opis;
    }
}
