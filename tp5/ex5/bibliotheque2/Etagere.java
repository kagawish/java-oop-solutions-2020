/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.bibliotheque2;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Etagere {
  private Livre[] livres;
  private int nbLivres = 0;
  private int nbModifs = 0;

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
        this.nbModifs++;
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
  
  public Iterator<Livre> iterator() {
      IterLivres it = new IterLivres();
      return it;
  }
  
  class IterLivres implements Iterator<Livre> {
        private int counter = 0;
        private int oldNbModifs;

        public IterLivres() {
            this.oldNbModifs = nbModifs;
        }

        @Override
        public boolean hasNext() {
            this.checkModifs();
            
            if (this.counter < livres.length) {
                return true;
            }
            return false;
        }

        @Override
        public Livre next() {
            this.checkModifs();
            
            Livre l = livres[this.counter];
            this.counter++;
            return l;
        }

        @Override
        public void remove() {
            this.checkModifs();
            
            Livre[] newLivres = new Livre[livres.length - 1];
            System.arraycopy(livres, 0, newLivres, 0, newLivres.length);
            livres = newLivres;
            nbLivres--;
        }
        
        private void checkModifs() {
            if (this.oldNbModifs != nbModifs) {
                throw new ConcurrentModificationException();
            }
        }
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
    
    try {
        Etagere e = new Etagere(3);
        e.ajouter(new Livre("a1", "t1"));
        e.ajouter(new Livre("a2", "t1"));
        e.ajouter(new Livre("a3", "t1"));
        
        Iterator<Livre> it = e.iterator();
        while(it.hasNext()) {
            Livre l = it.next();
            System.out.println(l);
        }
        
    } catch (EtagerePleineException e) {
        
    }
    
    System.out.println(lib);
  }
}
