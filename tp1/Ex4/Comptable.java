public class Comptable {

  private double prixTotale;

  public void comptabiliser(Livre l) {
    prixTotale += l.getPrix();
  }

  public double getPrixTotale() {
    return prixTotale;
  }
}
