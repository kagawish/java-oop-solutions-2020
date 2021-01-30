package eg.ufe.kagawish.abrbinaire;

public class Employe extends Personne {

	private double salaire;

	public Employe(String nom) {
		super(nom);
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public double getSalaire() {
		return salaire;
	}

	@Override
	public String toString() {
		return "Employe:" + getNom() + ";" + salaire;
	}

}
