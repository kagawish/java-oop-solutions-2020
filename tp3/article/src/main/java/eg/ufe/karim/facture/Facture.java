/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.facture;

import eg.ufe.karim.article.Article;

/**
 *
 * @author karim
 */
public class Facture {
    private String nom, date;
    private Ligne[] lignes = new Ligne[20];
    private int numero = 0;
    private int nbLignes = 0;
    private static int nbFacture = 0;

    public Facture(String nom, String date) {
        this.nom = nom;
        this.date = date;
        Facture.nbFacture++;
        this.numero = Facture.nbFacture;
    }

    public void ajouterLigne(Article a, int quantite) {
        Ligne l = new Ligne(a, quantite);
        this.lignes[this.nbLignes] = l;
        this.nbLignes++;
    }

    public void afficheToi() {
        System.out.printf("Facture numéro %d ; Client : %s ; Date : %s %n",
                numero, nom, date);
        System.out.printf("%7s | %6s | %22s | %10s | %10s %n",
                "Quant.", "Réf.", "Nom", "PU", "PT");
        for (int i = 0; i < nbLignes; i++) {
            lignes[i].afficheToi();
        }
        System.out.printf("%35s Prix total facture : %10d", "", getPrixTotal());
    }
    
    private int getPrixTotal() {
        int total = 0;
        for (int i = 0; i < this.nbLignes; i++) {
            total += this.lignes[i].prixTotal();
        }
        return total;
    }
}
