package fr.dampierre;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("bonjour !");
        // int heureTravaillees = 120;
        Scanner claviers = new Scanner(System.in);
        System.out.print("entrer le nombre d'heure travailles ");
        int heureTravaillees = claviers.nextInt();
        System.out.print("entrer le taux horaire");
        double tauxHoraire = claviers.nextDouble();
        double salaire = heureTravaillees * tauxHoraire;

        System.out.println("le salaire brut est de :");
        System.out.println(salaire);// comm

    }

}
