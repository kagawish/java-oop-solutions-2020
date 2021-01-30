package eg.ufe.kagawish.abrbinaire;

public class Noeud<E> {

	private E valeur;
	private Noeud<E> noeudGauche;
	private Noeud<E> noeudDroit;

	public Noeud() {
	}

	public Noeud(E valeur) {
		this.valeur = valeur;
	}

	public Noeud(E valeur, Noeud<E> noeudGauche, Noeud<E> noeudDroit) {
		this(valeur);
		this.noeudGauche = noeudGauche;
		this.noeudDroit = noeudDroit;
	}

	public E getValeur() {
		return this.valeur;
	}

	public Noeud<E> getNoeudGauche() {
		return this.noeudGauche;
	}

	public Noeud<E> getNoeudDroit() {
		return this.noeudDroit;
	}

	public void setValeur(E valeur) {
		this.valeur = valeur;
	}

	public void setNoeudGauche(Noeud<E> noeudGauche) {
		this.noeudGauche = noeudGauche;
	}

	public void setNoeudDroit(Noeud<E> noeudDroit) {
		this.noeudDroit = noeudDroit;
	}

	@Override
	public String toString() {
		String noeudGaucheStr = "";
		if (this.noeudGauche != null) {
			noeudGaucheStr = this.noeudGauche.toString();
		}

		String noeudDroitStr = "";
		if (this.noeudDroit != null) {
			noeudDroitStr = this.noeudDroit.toString();
		}

		return "[" + noeudGaucheStr + "<- (" + this.valeur + ") -> " + noeudDroitStr + "]";
	}
}