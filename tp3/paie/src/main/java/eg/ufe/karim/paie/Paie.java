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
public class Paie {
    public static void main(String[] args) {
        Employe[] employes = new Employe[4];
        
        employes[0] = new EmployeComercial("Marc", 1, 10000, 50000);
        employes[1] = new EmployeHoraire("Jean", 30, 45, 20);
        employes[2] = new EmployeHoraire("François", 50, 42, 10);
        employes[3] = new EmployeHoraire("Leila", 50, 38, 10);
        
        for(Employe e : employes) {
            System.out.println(e);
        }
    }
}
