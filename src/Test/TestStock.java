package Test;

import model.Ordinateur;
import model.Stock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestStock {
    public static void main(String[] args) {
        // Création du stock
        Stock stock = new Stock(5);

        // Création de quelques ordinateurs
        Ordinateur o1 = new Ordinateur("Dell","Inspiron 15","Intel i5",8,512);
        Ordinateur o2 = new Ordinateur("HP","Pavilion","AMD Ryzen 7",16,1024);
        Ordinateur o3 = new Ordinateur("Apple","MacBook Air","M2",8,256);

        // Ajout dans le stock
        stock.ajouterOrdinateur(o1);
        stock.ajouterOrdinateur(o2);
        stock.ajouterOrdinateur(o3);

        // Affichage du stock
        stock.afficherStock();

        // Recherche d’un ordinateur
        System.out.println("\n🔍 Recherche d’un ordinateur HP Pavilion :");
        Ordinateur resultat = stock.rechercherOrdinateur("HP","Pavilion");
        if (resultat != null)
            resultat.afficherInfos();
        else
            System.out.println("Aucun ordinateur trouvé.");

        // Suppression d’un ordinateur
        System.out.println("\n" +
                " Suppression du Dell Inspiron 15...");
        stock.supprimerOrdinateur("Dell","Inspiron 15");

        // Affichage après suppression
        stock.afficherStock();
    }
}
