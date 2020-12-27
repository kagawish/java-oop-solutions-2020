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
public class Ligne {
    private Article article;
    private int quantite;

    public Ligne(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    public void afficheToi() {
        System.out.printf("%7d | %6s | %22s | %10d | %10d %n",
                quantite, article.getRef(),
                article.getNom(),
                article.getPrix(), prixTotal());
    }
    
    public int prixTotal() {
        return this.quantite * this.article.getPrix();
    }
}
