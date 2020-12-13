public class Livre {
  public static void main(String[] args){
    Livre l1 = new Livre ("Arthur", "Sherlock Holmes");
    Livre l2 = new Livre ("Victor Hugo", "Les miserables");
    System.out.println(l1.getAuteur());
    System.out.println(l2.getAuteur());
  }
  // Variables d'instance
  private String titre, auteur;
  private int nbPages;

  // Constructeur
  public Livre(String unAuteur, String unTitre) {
    auteur = unAuteur;
    titre = unTitre;
  }

  // Accesseur
  public String getAuteur() {
    return auteur;
  }

  // Modificateur
  public void setNbPages(int n) {
    nbPages = n;
  }
}