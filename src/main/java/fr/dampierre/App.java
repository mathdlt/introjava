package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Bonjour");

        // Recupérer le nombre d'heures travaillées
        // int heuresTravaillees = 120;

        // Scanner clavier = new Scanner(System.in);
        // System.out.print("Le nombre d'heures travaillées:");
        // ;
        // int heuresTravaillees = clavier.nextInt();

        // // Récupérer le taux d'horaires
        // System.out.print("Le taux horaire: ");
        // double tauxHoraire = clavier.nextDouble();

        // // // Multiplier le nombre d'heures par le taux d'horaires
        // double salaireBrut = heuresTravaillees * tauxHoraire;

        // // Afficher résultat
        // // System.out.print("Le salaire brut est de: ");
        // // System.out.println(salaire);
        // System.out.println("le salaire brut est de: " + salaireBrut);

        // Scanner clavier = new Scanner(System.in);
        // System.out.println("Nom");
        // String nom = clavier.next();
        // System.out.println("Nombre");
        // int nombre = clavier.nextInt();
        // System.out.println("Nom2");
        // String nom2 = clavier.next();
        // System.out.println("Adjectif");
        // String adjectif = clavier.next();
        // clavier.close();
        // System.out.println(
        // "Il était une fois un " + nom + " qui avait " + nombre + " " + nom2 + ".Cela
        // le rendait très"
        // + " " + adjectif);

        // Scanner clavier = new Scanner(System.in);
        // System.out.println("Quelle heure est-il ? ");
        // int heuresActuelles = clavier.nextInt();
        // System.out.println("Quelle minute est-il ? ");
        // int minutesActuelles = clavier.nextInt();
        // System.out.println("Quelle seconde est-il");
        // int secondesActuelles = clavier.nextInt();
        // System.out.println("Il est " + heuresActuelles + " heures " +
        // minutesActuelles + " minutes " + secondesActuelles
        // + " secondes ");
        // int totalSecondes = 86400 - (heuresActuelles * 3600 + minutesActuelles * 60 +
        // secondesActuelles);
        // System.out.println(
        // "Il reste " + totalSecondes + " secondes avant minuit");

        // Scanner clavier = new Scanner(System.in);
        // Random nombreRecherche = new Random();
        // System.out.println("Donnez moi un nombre entre 1 et 100");
        // int nombreDonne = clavier.nextInt();
        // System.out.println("Mon nombre est : " + nombreRecherche);
        // int ecart = nombreRecherche - nombreDonne;
        int salaire = 400;
        int prime = 250;
        int quota = 10;
        Scanner clavier = new Scanner(System.in);
        System.out.println("entrer le nobmbre de vente ");
        int nbventes = clavier.nextInt();
        clavier.close();
        if (nbventes >= quota) {
            salaire = salaire + prime;
            System.out.println("felicitation vous avez reussie votre nombe de vente");
        } else {
            int ventesManquante = quota - nbventes;
            System.out.println("il vous manque :" + ventesManquante + " b          -vente pour atteindre le quota ");
        }

    }

}
