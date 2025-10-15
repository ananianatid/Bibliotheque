package com.defitech.tp;

import java.time.LocalDate;

public class LivreNumerique extends Livre {
    private String format;
    private double tailleMo;

    public LivreNumerique(){

    }
    public LivreNumerique(String titre, String ISBN, Auteur auteur, LocalDate anneePublication, Boolean estEmprunte,String format, double tailleMo){
        super(titre,ISBN,auteur,anneePublication,estEmprunte);
        this.format = format;
        this.tailleMo = tailleMo;
    }

    @Override
    public String toString() {
        return "LivreNumerique{" +
                "format='" + format + '\'' +
                ", tailleMo=" + tailleMo +
                '}';
    }
}
