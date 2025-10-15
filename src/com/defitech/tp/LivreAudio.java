package com.defitech.tp;

import java.time.LocalDate;

public class LivreAudio extends Livre {
    private String narrateur;
    private int duree;
    public LivreAudio(){

    }
    public LivreAudio(String titre, String ISBN, Auteur auteur, LocalDate anneePublication, Boolean estEmprunte, String narrateur, int duree){
        super(titre,ISBN,auteur,anneePublication,estEmprunte);
        this.narrateur = narrateur;
        this.duree = duree;

    }

    public String getNarrateur() {
        return narrateur;
    }

    public void setNarrateur(String narrateur) {
        this.narrateur = narrateur;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "LivreAudio{" +
                "narrateur='" + narrateur + '\'' +
                ", duree=" + duree +
                '}';
    }
}
