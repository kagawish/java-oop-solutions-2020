package eg.ufe.karim.entreprise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Entreprise implements Iterable<Employe> {
  private String nom;
  private List<Employe> employes;

  public Entreprise(String nom) {
    this.nom = nom;
    employes = new ArrayList<>();
  }
  
  public String getNom() {
    return nom;
  }

  public void engager(Employe emp) {
    employes.add(emp);
  }

  @Override
  public String toString() {
    return "Entreprise [nom=" + nom + ", employes=" + employes + "]";
  }
  
  // Q1
  public Iterator<Employe> iterEmployes() {
      return employes.iterator();
  }
  
  // Q2
  @Override
  public Iterator<Employe> iterator() {
      return employes.iterator();
  }
}
