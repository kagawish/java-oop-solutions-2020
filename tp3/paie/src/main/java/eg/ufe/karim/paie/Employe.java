/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.paie;

/**
 *
 * @author karim
 */
public abstract class Employe {
    private String nom;
    protected int pourcentage;

    public Employe(String nom, int pourcentage) {
        this.nom = nom;
        this.pourcentage = pourcentage;
    }
    
    public abstract int getSalaire();
    
    public String toString() {
        return this.nom + " a gagné " + this.getSalaire();
    }
}
