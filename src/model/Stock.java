package model;

public class Stock {
    private Ordinateur[] liste;
    private int nbOrdinateurs;

    // Constructeur : initialise le stock
    public Stock(int taille) {
        liste = new Ordinateur[taille];
        nbOrdinateurs = 0;
    }

    // Ajouter un ordinateur
    public void ajouterOrdinateur(Ordinateur o) {
        if (nbOrdinateurs < liste.length) {
            liste[nbOrdinateurs] = o;
            nbOrdinateurs++;
            System.out.println("Ordinateur ajouté au stock !");
        } else {
            System.out.println(" Stock plein, impossible d’ajouter.");
        }
    }

    // Afficher tous les ordinateurs
    public void afficherStock() {
        if (nbOrdinateurs == 0) {
            System.out.println("⚠ Aucun ordinateur dans le stock.");
        } else {
            System.out.println("\n--- Liste des ordinateurs en stock ---");
            for (int i = 0; i < nbOrdinateurs; i++) {
                liste[i].afficherInfos();
            }
        }
    }

    // Rechercher un ordinateur
    public Ordinateur rechercherOrdinateur(String marque, String modele) {
        for (int i = 0; i < nbOrdinateurs; i++) {
            if (liste[i].getMarque().equalsIgnoreCase(marque)
                    && liste[i].getModele().equalsIgnoreCase(modele)) {
                return liste[i];
            }
        }
        return null;
    }

    // Supprimer un ordinateur
    public void supprimerOrdinateur(String marque, String modele) {
        for (int i = 0; i < nbOrdinateurs; i++) {
            if (liste[i].getMarque().equalsIgnoreCase(marque)
                    && liste[i].getModele().equalsIgnoreCase(modele)) {
                // Décalage à gauche
                for (int j = i; j < nbOrdinateurs - 1; j++) {
                    liste[j] = liste[j + 1];
                }
                liste[nbOrdinateurs - 1] = null;
                nbOrdinateurs--;
                System.out.println("🗑 Ordinateur supprimé du stock !");
                return;
            }
        }
        System.out.println("Ordinateur introuvable.");
    }
}

