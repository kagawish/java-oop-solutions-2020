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
public class EmployeComercial extends Employe {
    private int salaireBase;
    private int chiffreAffaires;
    
    public EmployeComercial(String nom, int pourcentage, int salaireBase, int chiffreAffaires) {
        super(nom, pourcentage);
        this.salaireBase = salaireBase;
        this.chiffreAffaires = chiffreAffaires;
    }
    
    public int getSalaire() {
        double pourcentageCalcule = this.pourcentage / (double) 100;
        return (int) (this.salaireBase + this.chiffreAffaires * pourcentageCalcule);
    }
}
