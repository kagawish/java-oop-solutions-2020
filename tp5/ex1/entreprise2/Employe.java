package eg.ufe.karim.entreprise2;

public class Employe implements Comparable<Employe> {

    private String nom;
    private double salaire;

    public Employe(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Employe [nom=" + nom + ", salaire=" + salaire + "]";
    }

    @Override
    public int compareTo(Employe e) {
        if (this.nom.equals(e.getNom())) {
            return 0;
        } else if (this.nom.compareTo(e.getNom()) > 0) {
            return 1;
        }
        return -1;
    }
}
