/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.bibliotheque;

public class Livre {
  private String titre, auteur;

  public Livre(String unAuteur, String unTitre) {
    auteur = unAuteur;
    titre = unTitre;
  }

  @Override
  public String toString() {
    return "Livre [titre=" + titre + ",auteur=" + auteur + "]";
  }
}
