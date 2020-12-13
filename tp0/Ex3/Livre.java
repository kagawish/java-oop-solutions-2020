public class Livre {
  public static void main(String[] args){
    Livre l1 = new Livre ("Arthur", "Sherlock Holmes");
    Livre l2 = new Livre ("Victor Hugo", "Les miserables");
    System.out.println(l1.getAuteur());
    System.out.println(l2.getAuteur());
    l1.setNbPages(700);
    System.out.println(l1.getNbPages());

    l2.setNbPages(50);
    System.out.println(l2.getNbPages());

    System.out.println(l1.getNbPages() + l2.getNbPages());
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
    return this.auteur;
  }
  public String getTitre(){
    return this.titre;
  }
  public int getNbPages(){
    return this.nbPages;
  }

  // Modificateur
  public void setNbPages(int nbPages) {
    if(nbPages >= 0){
      this.nbPages = nbPages;
    }
    else{
      System.out.println("Error");
    }
  }

  public void setTitre(String unTitre) {
    titre = unTitre;
  }
    public void setAuteur(String unAuteur) {
    auteur = unAuteur;
  }
}