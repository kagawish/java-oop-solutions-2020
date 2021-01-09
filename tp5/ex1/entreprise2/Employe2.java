package eg.ufe.karim.entreprise2;

public class Employe2 {

    private String nom;
    private double salaire;

    public Employe2(String nom, double salaire) {
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
}
