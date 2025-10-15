package com.defitech.tp;

import java.time.LocalDate;
import java.util.Objects;

// ameliorer le cde avec le design patter builder
public class Livre implements Empruntable {
    private String titre;
    private String ISBN;
    private Auteur auteur;
    private LocalDate anneePublication;
    private Boolean estEmprunte;
    private LocalDate dateRetourPrevu;
    private String emprunteur;

    public Livre(){
        System.out.println("Livre crée");
    }

    public  Livre(String titre,String ISBN,Auteur auteur,LocalDate anneePublication,Boolean estEmprunte) {
        this.titre = titre;
        this.ISBN = ISBN;
        this.auteur = auteur;
        this.auteur.ajouterLivre(this);
        this.anneePublication = anneePublication;
        this.estEmprunte = false;
        this.dateRetourPrevu = null;
        this.emprunteur = "unknown";
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

    public LocalDate getDateRetourPrevu() {
        return dateRetourPrevu;
    }

    public void setDateRetourPrevu(LocalDate dateRetourPrevu) {
        this.dateRetourPrevu = dateRetourPrevu;
    }

    public String getEmprunteur() {
        return emprunteur;
    }

    public void setEmprunteur(String emprunteur) {
        this.emprunteur = emprunteur;
    }

    @Override
    public String toString() {
        return "Livre {\n" +
                "titre = " + titre + '\n' +
                "ISBN = " + ISBN + '\n' +
                "auteur = " + auteur.getFullName() +
                "\nanneePublication = " + anneePublication +
                "\nestEmprunte = " + estEmprunte +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return Objects.equals(ISBN, livre.getISBN());
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }


    @Override
    public void emprunter(String enprunteur) {
        this.setEstEmprunte(true);
        setDateRetourPrevu(LocalDate.now().plusWeeks(2));
        this.setEmprunteur(emprunteur);

    }

    @Override
    public void retourner() {
        this.setEstEmprunte(false);
        this.setDateRetourPrevu(null);
        this.setDateRetourPrevu(null);

    }

    public boolean estDisponible() {
        return !this.estEmprunte;
    }



}
