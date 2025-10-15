package com.defitech.tp;

import java.time.LocalDate;

public interface Empruntable {
    public void emprunter(String enprunteur);
    public void retourner();
    public boolean estDisponible();
    public void setDateRetourPrevu(LocalDate dateRetourPrevu);
}
