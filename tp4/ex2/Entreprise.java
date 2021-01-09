/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.entreprise;

import java.util.ArrayList;

/**
 *
 * @author karim
 */
public class Entreprise {
    private String nom;
    private ArrayList<Employe> employes = new ArrayList<>();
    
    public Entreprise(String nom) {
        this.nom = nom;
    }
    
    public void engager(Employe e) throws EmployeException {
        if (!this.employes.contains(e)) {
            this.employes.add(e);
        } else {
            throw new EmployeException();   
        }
    }
    
    public void degager(Employe e) throws EmployeException {
        if (this.employes.contains(e)) {
            this.employes.remove(e);
        } else {
            throw new EmployeException();
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder();
        sb.append(this.nom);
        sb.append("{");
        for (Employe e : this.employes) {
            sb.append(e);
        }
        sb.append("}");
        return sb.toString();
    }
}
