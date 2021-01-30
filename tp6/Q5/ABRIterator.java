package eg.ufe.kagawish.abrbinaire;

import java.util.Iterator;
import java.util.Stack;

public class ABRIterator<E> implements Iterator<E> {
	private Stack<Noeud> stack = new Stack<>();
	
	public ABRIterator(Noeud racine) {
		this.stack.push(racine);
	}

	@Override
	public boolean hasNext() {
		if (this.stack.empty()) {
			return false;
		} else { 
			return true;
		}
	}

	@Override
	public E next() {
		Noeud<E> courante = this.stack.pop();
		
		if (courante.getNoeudGauche() != null) {
			this.stack.push(courante.getNoeudGauche());
		}
		
		if (courante.getNoeudDroit() != null) {
			this.stack.push(courante.getNoeudDroit());
		}
		
		return courante.getValeur();
	}
	
}
