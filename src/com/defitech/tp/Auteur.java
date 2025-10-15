package com.defitech.tp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Auteur {
    private  String nom;
    private String prenom;
    private String nationalite;
    private List livresEcrits;

    public Auteur() {
        System.out.println("l'auteur est créé");
    }

    public Auteur(String nom,String prenom,String nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.livresEcrits = new ArrayList<>();
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

    public String getFullName(){
        return  this.nom +" "+ this.prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public List getLivre() {
        return livresEcrits;
    }

    public void setLivre(List livre) {
        livresEcrits = livre;
    }


    public  List getLivresDeHugo() {
        return livresEcrits;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nationalite='" + nationalite + '\'' +
                ", livresEcrits=" + livresEcrits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auteur auteur = (Auteur) o;
        return Objects.equals(nom, auteur.nom) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom());
    }

    public void ajouterLivre(Livre livre){
        this.livresEcrits.add(livre);
    }
}

