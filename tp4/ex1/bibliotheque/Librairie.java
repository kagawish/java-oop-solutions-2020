/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.bibliotheque;

import java.util.ArrayList;

/**
 *
 * @author karim
 */
public class Librairie {
    private ArrayList<Etagere> etageres = new ArrayList<Etagere>();
    private final int TAILLE_ETAGERES = 2;
    
    public Librairie() {
        Etagere etagere = new Etagere(TAILLE_ETAGERES);
        etageres.add(etagere);
    }
    
    public void ajouterLivre(Livre l) {
        Etagere derniereEtagere = etageres.get(etageres.size() - 1);
        
        try {
            derniereEtagere.ajouter(l);
        } catch (EtagerePleineException e) {
            Etagere nouvelleEtagere = new Etagere(TAILLE_ETAGERES);
            this.etageres.add(nouvelleEtagere);
            this.ajouterLivre(l);
        }
    }
    
    public String toString() {
        return this.etageres.toString();
    }
}
