/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.test;

import eg.ufe.karim.article.*;
import eg.ufe.karim.facture.*;

/**
 *
 * @author karim
 */
public class TestFacture {
    public static void main(String[] args) {
        // CrÃ©ation des articles
        Stylo s1 = new Stylo("s1", "Stylo jade", 50, "Noir");
        Stylo s2 = new Stylo("s2", "Stylo or", 100, "Or");
        Ramette r1 = new Ramette("r1", "Ramette haute qualitÃ©", 9, 80);

        // CrÃ©ation d'un lot de 5 stylos or (10 % de rÃ©duction)
        Lot l1 = new Lot("l1", s2, 5, 10);

        // CrÃ©ation d'une facture
        Facture f1 = new Facture("Toto", "10/11/2010");

        // Ajout des lignes de la commande
        f1.ajouterLigne(s1, 10);
        f1.ajouterLigne(r1, 15);
        f1.ajouterLigne(l1, 2);

        // Afficher la facture
        System.out.println(f1); // Juste pour voir
        System.out.println("Facture 1 :");
        f1.afficheToi();

        // CrÃ©ation d'une autre facture
        Facture f2 = new Facture("Bibi", "21/9/2010");

        // Ajout des lignes de la commande
        f2.ajouterLigne(s1, 3);
        f2.ajouterLigne(r1, 2);

        // Affiche la facture
        System.out.println();
        System.out.println(f2);
        System.out.println("Facture 2 :");
        f2.afficheToi();

        // Test prix d'un lot
        s2.setPrix(1200);
        System.out.println("\nAffiche la 1Ã¨re facture aprÃ¨s changement de prix");
        System.out.println(f1);
        System.out.println("Facture 1 aprÃ¨s changement de prix de s2 :");
        f1.afficheToi();
    }
}
