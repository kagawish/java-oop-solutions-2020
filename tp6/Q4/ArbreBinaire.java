package eg.ufe.kagawish.abrbinaire;

import java.util.Comparator;

public class ArbreBinaire<E extends Comparable<? super E>> {

	private Noeud<E> noeudRacine;
	private Comparator<E> comp;

	public ArbreBinaire() {
	}

	public ArbreBinaire(Noeud<E> noeudRacine) {
		this.noeudRacine = noeudRacine;
	}

	public ArbreBinaire(E noeudRacineValeur) {
		Noeud<E> noeud = new Noeud<>(noeudRacineValeur);
		this.noeudRacine = noeudRacine;
	}
	
	public ArbreBinaire(E noeudRacineValeur, Comparator<E> comp) {
		this(noeudRacineValeur);
		this.comp = comp;
	}

	public void afficherElements() {
		afficherInfix(this.noeudRacine);
	}

	private void afficherInfix(Noeud<E> noeud) {
		if (noeud != null) {
			afficherInfix(noeud.getNoeudGauche());
			System.out.println(noeud.getValeur().toString());
			afficherInfix(noeud.getNoeudDroit());
		}
	}
	
	private int compare(E el, E el2) {
		if (this.comp != null) {
			return this.comp.compare(el, el2);
		} else {
			return el.compareTo(el2);
		}
	}

	public boolean contient(E valeur) {
		Noeud<E> noeud = new Noeud<>(valeur);

		if (this.noeudRacine == null) {
			return false;
		} else {
			return contientRecursif(noeud, this.noeudRacine);
		}
	}

	private boolean contientRecursif(Noeud<E> noeud, Noeud<E> noeudCourante) {
		if (this.compare(noeud.getValeur(), noeudCourante.getValeur()) == 0) {
			return true;
		}

		if (this.compare(noeud.getValeur(), noeudCourante.getValeur()) <= 0) {
			if (noeudCourante.getNoeudGauche() != null) {
				return this.contientRecursif(noeud, noeudCourante.getNoeudGauche());
			} else {
				return false;
			}
		} else {
			if (noeudCourante.getNoeudDroit() != null) {
				return this.contientRecursif(noeud, noeudCourante.getNoeudDroit());
			} else {
				return false;
			}
		}
	}

	public void inserer(E valeur) {
		Noeud<E> noeud = new Noeud<>(valeur);
		if (this.noeudRacine == null) {
			this.noeudRacine = noeud;
		} else {
			insererRecursif(noeud, this.noeudRacine);
		}
	}

	private void insererRecursif(Noeud<E> noeud, Noeud<E> noeudCourante) {
		if (this.compare(noeud.getValeur(), noeudCourante.getValeur()) <= 0) {
			if (noeudCourante.getNoeudGauche() != null) {
				this.insererRecursif(noeud, noeudCourante.getNoeudGauche());
			} else {
				noeudCourante.setNoeudGauche(noeud);
			}
		} else {
			if (noeudCourante.getNoeudDroit() != null) {
				this.insererRecursif(noeud, noeudCourante.getNoeudDroit());
			} else {
				noeudCourante.setNoeudDroit(noeud);
			}
		}
	}

	private void insererNonRecursif(Noeud<E> noeud) {
		Noeud<E> noeudCourante = this.noeudRacine;
		while (true) {
			if (this.compare(noeud.getValeur(), noeudCourante.getValeur()) <= 0) {
				if (noeudCourante.getNoeudGauche() != null) {
					noeudCourante = noeudCourante.getNoeudGauche();
				} else {
					noeudCourante.setNoeudGauche(noeud);
					break;
				}
			} else {
				if (noeudCourante.getNoeudDroit() != null) {
					noeudCourante = noeudCourante.getNoeudDroit();
				} else {
					noeudCourante.setNoeudDroit(noeud);
					break;
				}
			}
		}
	}

	public String toString() {
		return this.noeudRacine.toString();
	}
}
