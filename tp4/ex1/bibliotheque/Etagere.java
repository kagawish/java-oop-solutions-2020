/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.bibliotheque;

import java.util.Arrays;

public class Etagere {
  private Livre[] livres;
  private int nbLivres = 0; // nbre de livres qu'il y a dans l'Ã©tagÃ¨re

  public Etagere(int nb) {
    livres = new Livre[nb];
  }
  
  public int getNbMaxLivres() {
    return livres.length;
  }
  
  public int getNbLivres() {
    return nbLivres;
  }

  public void ajouter(Livre l) throws EtagerePleineException {
    if (nbLivres < livres.length) {
        livres[nbLivres] = l;
        nbLivres++;
    } else {
        EtagerePleineException ex = new EtagerePleineException(this);
        throw ex;
    }
  }
  
  public Livre getLivre(int i) {
    return livres[i];
  }

  public String toString() {
    return "Etagere [nbLivres=" + nbLivres + ", livres=" + Arrays.toString(livres) + "]";
  }

  public static void main(String[] args) {
    Librairie lib = new Librairie();
    lib.ajouterLivre(new Livre("a1", "t1"));
    lib.ajouterLivre(new Livre("a2", "t2"));
    lib.ajouterLivre(new Livre("a3", "t3"));
    lib.ajouterLivre(new Livre("a4", "t4"));
    lib.ajouterLivre(new Livre("a5", "t5"));
    lib.ajouterLivre(new Livre("a6", "t6"));
    lib.ajouterLivre(new Livre("a7", "t7"));
    
    System.out.println(lib);
  }
}
