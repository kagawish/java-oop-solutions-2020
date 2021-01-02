/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.test;

import eg.ufe.karim.article2.Article;
import eg.ufe.karim.article2.Ramette;
import eg.ufe.karim.article2.Lot;
import eg.ufe.karim.article2.Stylo;
import eg.ufe.karim.facture.*;

/**
 *
 * @author karim
 */
public class TestFacture {
    public static void main(String[] args) {
    // CrÃ©ation des articles
    Stylo s1 = new Stylo("s001", "Stylo jade", 500, "Noir");
    Stylo s2 = new Stylo("s002", "Stylo or", 1000, "Or");
    Ramette r1 = new Ramette("r001", "Ramette haute qualitÃ©", 95, 80);

    // CrÃ©ation des lots (10 % de rÃ©duction)
    Lot l1 = new Lot("l001", "s002", 5, 10);

    // CrÃ©ation d'une facture
    Facture f1 = new Facture("Toto", "21/9/99");

    // Ajout des lignes de la commande (les articles sont repÃ©rÃ©s par leur rÃ©fÃ©rence)
    f1.ajouterLigne("s001",10);
    f1.ajouterLigne("r001",15);
    f1.ajouterLigne("l001",2);

    // Afficher la facture
//    System.out.println(f1);

    // CrÃ©ation d'une autre facture
    Facture f2 = new Facture("Bibi", "21/9/99");

    // Ajout des lignes de la commande
    f2.ajouterLigne("s001", 3);
    f2.ajouterLigne("r001", 2);

    // Affiche la facture
//    System.out.println();
//    System.out.println(f2);
    
    f1.afficheToi();
    f2.afficheToi();
  }
}
