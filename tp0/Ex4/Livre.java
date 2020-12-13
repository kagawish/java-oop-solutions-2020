public class Livre{
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