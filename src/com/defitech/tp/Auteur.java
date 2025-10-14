package com.defitech.tp;

import java.util.List;

public class Auteur {
    public String nom;
    public String prenom;
    public String nationalite;
    public List Livre;

    public Auteur() {
        System.out.println("l'auteur est créé");
    }

    public Auteur(String nom,String prenom,String nationalite,List Livre) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.Livre = Livre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public List getLivre() {
        return Livre;
    }

    public void setLivre(List livre) {
        Livre = livre;
    }
}

