import com.defitech.tp.Auteur;
import com.defitech.tp.Bibliotheque;
import com.defitech.tp.Livre;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

void main() {
    Bibliotheque alexandrie = new Bibliotheque();
    Auteur victorHugo = new Auteur("Victor","Hugo","francaise");
    Auteur mathiewWalker = new Auteur("Mathiew","Walker","Americain");
    Auteur georgesMartin = new Auteur("Georges","Martin","Americain");

    Livre  lesMiserales = new Livre("Les miseerables","000000000",victorHugo ,LocalDate.of(1984,10,11),false);
    Livre  pourquoiDormons = new Livre("Pourquoi nous dormons","000000001",mathiewWalker ,LocalDate.of(1984,10,12),false);
    Livre  feuEtSang = new Livre("feu et sang ","000000003",georgesMartin ,LocalDate.of(1984,10,13),false);

    System.out.println(lesMiserales);
}
