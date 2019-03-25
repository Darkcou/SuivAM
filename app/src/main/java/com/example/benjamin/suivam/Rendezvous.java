package com.example.benjamin.suivam;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;
import java.util.List;

@DatabaseTable
public class Rendezvous {
    @DatabaseField(foreign = true, foreignAutoCreate = true)
    private Visiteur visiteur;
    @DatabaseField(foreign = true, foreignAutoCreate = true)
    private List<Medecien> medeciens;

    @DatabaseField
    private Date dateVisite;
    @DatabaseField
    private int heureArriver;
    @DatabaseField
    private int heureDebut;
    @DatabaseField
    private int heureDepart;
    @DatabaseField
    private boolean rendezVous;

    public Rendezvous(Date dateVisite, int heureArriver, int heureDebut, int heureDepart, boolean rendezVous) {
        this.dateVisite = dateVisite;
        this.heureArriver = heureArriver;
        this.heureDebut = heureDebut;
        this.heureDepart = heureDepart;
        this.rendezVous = rendezVous;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public List<Medecien> getMedeciens() {
        return medeciens;
    }

    public Date getDateVisite() {
        return dateVisite;
    }

    public int getHeureArriver() {
        return heureArriver;
    }

    public int getHeureDebut() {
        return heureDebut;
    }

    public int getHeureDepart() {
        return heureDepart;
    }

    public boolean isRendezVous() {
        return rendezVous;
    }

    public void setDateVisite(Date dateVisite) {
        this.dateVisite = dateVisite;
    }

    public void setHeureArriver(int heureArriver) {
        this.heureArriver = heureArriver;
    }

    public void setHeureDebut(int heureDebut) {
        this.heureDebut = heureDebut;
    }

    public void setHeureDepart(int heureDepart) {
        this.heureDepart = heureDepart;
    }

    public void setRendezVous(boolean rendezVous) {
        this.rendezVous = rendezVous;
    }


}
