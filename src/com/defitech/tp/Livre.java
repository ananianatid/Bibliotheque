package com.defitech.tp;

import java.time.LocalDate;
// ameliorer le cde avec le design patter builder
public class Livre {
    private String titre;
    private String ISBN;
    private Auteur auteur;
    private LocalDate anneePublication;
    private Boolean estEmprunte;

    public Livre(){
        System.out.println("Livre crée");
    }

    public  Livre(String titre,String ISBN,Auteur auteur,LocalDate anneePublication,Boolean estEmprunte) {
        this.titre = titre;
        this.ISBN = ISBN;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.estEmprunte = false;
    }
    // titre
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    // ISBN
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    //auteur
    public Auteur getAuteur() {
        return auteur;
    }
    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    //annee de publicatiob
    public LocalDate getAnneePublication() {
        return anneePublication;
    }
    public void setAnneePublication(LocalDate anneePublication) {
        this.anneePublication = anneePublication;
    }
    // emprunt
    public Boolean getEstEmprunte() {
        return estEmprunte;
    }
    public void setEstEmprunte(Boolean estEmprunte) {
        this.estEmprunte = estEmprunte;
    }
}
