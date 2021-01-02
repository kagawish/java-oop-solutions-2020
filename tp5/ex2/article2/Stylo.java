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
public class Stylo extends ArticleUnitaire {
    private String couleur;
    
    public Stylo(String ref, String nom, int prix, String couleur) {
        super(ref, nom, prix);
        this.couleur = couleur;
    }
    
    public String getCouleur() {
        return this.couleur;
    }
    
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
