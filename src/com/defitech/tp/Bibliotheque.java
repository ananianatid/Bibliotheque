package com.defitech.tp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Bibliotheque {
    private List <Livre> livres;
    private Map <String,String> emprunts;

    public Bibliotheque(List livres, Map emprunts){
        this.livres = livres;
        this.emprunts = emprunts;
    }

    public List getLivres() {
        return livres;
    }

    public void setLivres(List livres) {
        this.livres = livres;
    }

    public Map getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(Map emprunts) {
        this.emprunts = emprunts;
    }
    public void ajouterLivre(Livre livre){
        if (!livres.contains(livre)){
            livres.add(livre);
        }
    }
    public void supprimerlivre(Livre livre) throws LivreNonDisponibleException {
        if(!livres.getFirst().getEstEmprunte()){
            livres.remove(livres);
        }else {
            throw new LivreNonDisponibleException("impossible de suprimer livre deja emprunté");
        }
    }
    public  void emprunterLivre(Livre livre,String emprunteur) throws livreInexistantException, livreNonDispoibleException {
        if(livre == null ) throw new livreInexistantException("impossible d'emprunter ce livre");
        if(livre.estDisponible()){
            livre.setEmprunteur(emprunteur);
            emprunts.put(livre.getISBN(),emprunteur);

        } else{
            throw new livreNonDispoibleException("le livre n'est pas disponible");
        }
    }
    public void retournerLivre(Livre livre){
        livre.retourner();
        emprunts.remove(livre.getISBN());
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "livres=" + livres +
                ", emprunts=" + emprunts +
                '}';
    }
}
