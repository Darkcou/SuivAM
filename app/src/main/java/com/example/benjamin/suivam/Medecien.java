package com.example.benjamin.suivam;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.List;

@DatabaseTable
public class Medecien {
    private int idMedecien;
    private String nom;
    private String prenom;
    @DatabaseField(foreign = true)
    private List<Cabinet> cabinets ;

    public Medecien(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
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

    public List<Cabinet> getCabinets() {
        return cabinets;
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

    public void setCabinets(List<Cabinet> cabinets) {
        this.cabinets = cabinets;
    }

    @Override
    public String toString() {
        return "Medecien{" +
                "idMedecien=" + idMedecien +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cabinets=" + cabinets +
                '}';
    }
}
