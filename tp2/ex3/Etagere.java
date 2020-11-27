import java.util.Arrays;

public class Etagere {
    private Livre[] livres;
    private int nbLivres = 0;

    public Etagere(int nbLivreMax) {
        this.livres = new Livre[nbLivreMax];
    }

    public int getNbLivreMax() {
        return this.livres.length;
    }

    public int getNbLivres() {
        return this.nbLivres;
    }

    public String toString() {
        return Arrays.toString(this.livres);
    }

    public void ajouter(Livre l) {
        if (this.nbLivres == this.getNbLivreMax()) {
            System.out.println("Étagère Pleine");
        } else {
            this.livres[nbLivres] = l;
            this.nbLivres++;
        }
    }

    public Livre getLivre(int position) {
        Livre l = this.livres[position - 1];
        return l;
    }

    public int chercher(String titre, String auteur) {
        for (int i = 0; i < this.nbLivres; i++) {
            Livre l = this.livres[i];
            if (titre.equals(l.getTitre()) && auteur.equals(l.getAuteur())) {
                return i + 1;
            }
        }
        return 0;
    }

    public int[] chercherLivres(String titre, String auteur) {
        int[] results = new int[this.nbLivres];
        int j = 0;
        for (int i = 0; i < this.nbLivres; i++) {
            Livre l = this.livres[i];
            if (titre.equals(l.getTitre()) && auteur.equals(l.getAuteur())) {
                results[j] = i + 1;
                j++;
            }
        }
        int[] results2 = new int[j];
        System.arraycopy(results, 0, results2, 0, j);

        return results2;
    }

    public Livre[] chercherAuteur(String auteur) {
        Livre[] results = new Livre[this.nbLivres];
        int j = 0;
        for (int i = 0; i < this.nbLivres; i++) {
            Livre l = this.livres[i];
            if (auteur.equals(l.getAuteur())) {
                results[j] = l;
                j++;
            }
        }
        Livre[] results2 = new Livre[j];
        System.arraycopy(results, 0, results2, 0, j);

        return results2;
    }
}