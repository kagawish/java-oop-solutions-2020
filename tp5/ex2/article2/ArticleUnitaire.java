/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.article2;

/**
 *
 * @author karim
 */
public class ArticleUnitaire extends Article {
    private int prix;
    
    public ArticleUnitaire(String ref, String nom, int prix) {
        super(ref, nom);
        this.prix = prix;
    }
    
    @Override
    public int getPrix() {
        return prix;
    }
    
    public void setPrix(int prix) {
        this.prix = prix;
    }
}
