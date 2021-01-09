/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.entreprise;

public class Employe {

  private String nom;

  public Employe(String nom) {
    this.nom = nom;
  }

  public String getNom() {
    return nom;
  }

  @Override
  public String toString() {
    return "Employe{" + "nom=" + nom + '}';
  }
  
  @Override
  public boolean equals(Object o) {
      Employe e = (Employe) o;
      if (this.nom.equals(e.nom)) {
          return true;
      }
      return false;
  }
}