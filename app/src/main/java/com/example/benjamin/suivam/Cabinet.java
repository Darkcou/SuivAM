package com.example.benjamin.suivam;

import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable()
public class Cabinet {
    private int idCabinet;
    private String nom;
    private String adresse;

    public Cabinet(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public int getIdCabinet() {
        return idCabinet;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setIdCabinet(int idCabinet) {
        this.idCabinet = idCabinet;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Cabinet{" +
                "idCabinet=" + idCabinet +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
