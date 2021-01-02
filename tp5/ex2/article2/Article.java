/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.article2;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 *
 * @author karim
 */
public abstract class Article {
    private String ref;
    private String nom;
    private static Map<String,Article> bdd = new HashMap<>();
    
    public Article(String ref, String nom) {
        this(ref);
        this.nom = nom;
    }
    
    public Article(String ref) {
        this.ref = ref;
        bdd.put(ref, this);
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
    
    public abstract int getPrix();
    
    public static Article getArticle(String ref) {
        if (bdd.containsKey(ref) == false) {
            throw new NoSuchElementException();
        }
        
        return bdd.get(ref);
    }
}
