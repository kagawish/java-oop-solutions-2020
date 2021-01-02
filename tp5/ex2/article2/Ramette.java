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
public class Ramette extends ArticleUnitaire {
    private int grammage;
    
    public Ramette(String ref, String nom, int prix, int grammage) {
        super(ref, nom, prix);
        this.grammage = grammage;
    }
    
    public int getGrammage() {
        return this.grammage;
    }
    
    public void setGrammage(int grammage) {
        this.grammage = grammage;
    }
} 
