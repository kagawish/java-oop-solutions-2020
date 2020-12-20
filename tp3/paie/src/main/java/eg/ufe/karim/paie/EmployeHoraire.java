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
public class EmployeHoraire extends Employe {
    private int heuresTravailles;
    private int tarifHoraire;
    
    public EmployeHoraire(String nom, int pourcentage, int heuresTravailles, int tarifHoraire) {
        super(nom, pourcentage);
        this.heuresTravailles = heuresTravailles;
        this.tarifHoraire = tarifHoraire;
    }
    
    @Override
    public int getSalaire() {
        int heuresSup = this.heuresTravailles - 39;
        
        if (heuresSup <= 0) {
            return this.heuresTravailles * this.tarifHoraire;
        } else {
            double pourcentageCalcule = 1 + ((double) this.pourcentage / 100);
            return (int)((39 * this.tarifHoraire) + heuresSup * pourcentageCalcule * this.tarifHoraire);
        }
    }
}
