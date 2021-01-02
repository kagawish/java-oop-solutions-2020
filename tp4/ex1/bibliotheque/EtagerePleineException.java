/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.bibliotheque;

/**
 *
 * @author karim
 */
public class EtagerePleineException extends Exception {
    private Etagere etagere;
    
    public EtagerePleineException (Etagere etagere) {
        super("Elle ne peut contenir que " + etagere.getNbMaxLivres() + " livres");
        this.etagere = etagere;
    }
}
