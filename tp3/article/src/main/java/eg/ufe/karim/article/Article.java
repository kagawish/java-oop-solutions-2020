/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.article;

/**
 *
 * @author karim
 */
public class Article {
    private String ref;
    private String nom;
    
    public Article(String ref, String nom) {
        this.ref = ref;
        this.nom = nom;
    }
    
    public String getRef() {
        return ref;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return "[" + this.ref + ", " + this.nom + "]";
    }
}
