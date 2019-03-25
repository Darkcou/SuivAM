package com.example.benjamin.suivam;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Medecien {
    @DatabaseField(generatedId = true)
    private int idMedecien;
    @DatabaseField
    private String nom;
    @DatabaseField
    private String prenom;
    @DatabaseField(foreign = true, foreignAutoCreate = true)
    private Cabinet cabinet;

    public Medecien(String nom, String prenom, Cabinet cabinet) {
        this.nom = nom;
        this.prenom = prenom;
        this.cabinet = cabinet;
    }

    public int getIdMedecien() {
        return idMedecien;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public void setIdMedecien(int idMedecien) {
        this.idMedecien = idMedecien;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCabinet(Cabinet cabinet) {
        this.cabinet = cabinet;
    }

    @Override
    public String toString() {
        return "Medecien{" +
                "idMedecien=" + idMedecien +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cabinet=" + cabinet +
                '}';
    }
}
