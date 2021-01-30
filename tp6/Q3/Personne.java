package eg.ufe.kagawish.abrbinaire;

public class Personne implements Comparable<Personne> {

	private String nom;

	public Personne(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public int compareTo(Personne autrePersonne) {
		return nom.compareTo(autrePersonne.nom);
	}

	@Override
	public boolean equals(Object o) {
		if (o.getClass() != this.getClass()) {
			return false;
		}
		return nom == ((Personne) o).nom;
	}

	@Override
	public String toString() {
		return "Personne:" + nom;
	}
}
