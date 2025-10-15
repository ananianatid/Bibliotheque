import com.defitech.tp.Auteur;
import com.defitech.tp.Livre;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

void main() {

    Auteur victorHugo = new Auteur("Hugo", "Victor", "Francaise", new ArrayList<>());
    System.out.println("Ateur créé : " + victorHugo.getPrenom() + " " + victorHugo.getNom());
    System.out.println("------------------------------------");


    Livre lesMiserables = new Livre(
            "Les Misérables",
            "9782384610020",
            victorHugo,
            LocalDate.of(1862, 4, 3),
            false
    );


    List livresDeHugo = victorHugo.getLivre();
    livresDeHugo.add(lesMiserables);

    System.out.println("--- Détails du Livre ---");
    System.out.println(lesMiserables);

    System.out.println("\n--- Détails de l'Auteur ---");
    System.out.println("Auteur: " + victorHugo.getPrenom() + " " + victorHugo.getNom());

    System.out.println("Titre du premier livre de sa liste: " + ((Livre) victorHugo.getLivre().get(0)).getTitre());

    System.out.println("\n--- Test d'une modification via les setter- ---");
    System.out.println("Statut d'emprunt initial : " + lesMiserables.getEstEmprunte());

    lesMiserables.setEstEmprunte(true);
    System.out.println("Nouvau statut d'emprunt : " + lesMiserables.getEstEmprunte());
}
