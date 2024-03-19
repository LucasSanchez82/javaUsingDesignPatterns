package com.mycompany.designpatterns;

import java.util.Scanner;

public class App {

    static final Scanner scan = new Scanner(System.in);
    static final GestionAlertes gestionAlertes = new GestionAlertes();

    private static void nouvelAbonne() {
        System.out.println("\nSaisissez le nom du nouvel abonné :");
        String nom = App.scan.nextLine();

        // Création et ajout d'un nouvel abonné dans gestionAlerte
        gestionAlertes.addAbonne(new Abonne(nom));

    }

    private static void creationAlerte() {
        System.out.println("\nSaisissez le message d'alerte :");
        String alerte = App.scan.nextLine();

        // Demande d'envoi de l'alerte à gestionAlerte
        gestionAlertes.envoiAlerte(alerte);
    }

    public static void main(String[] args) throws Exception {
        int choixUtilisateur = 0;

        do {
            if (choixUtilisateur < 0 || choixUtilisateur > 2) {
                System.out.println("\n=> Vous devez choisir entre 0, 1 ou 2 uniquement !");
            }
            System.out.println("\nGestion des alertes");
            System.out.println("-------------------\n");
            System.out.println("\t1. Nouvel abonné");
            System.out.println("\t2. Création d'une alerte");
            System.out.println("\t0. Quitter\n");

            System.out.print("Votre choix : ");
            choixUtilisateur = Integer.parseInt(App.scan.nextLine());

            switch (choixUtilisateur) {
                case 1:
                    App.nouvelAbonne();
                    break;
                case 2:
                    App.creationAlerte();
                    break;
                default:
                    break;
            }

        } while (choixUtilisateur != 0);

        scan.close();
    }
}
