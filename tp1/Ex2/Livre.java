public class Livre{
  // Variables d'instance
  private String titre, auteur;
  private int nbPages;
  private double prix;
  private boolean prixFixe;

  //Constructeur
  public Livre(){

  }

  public Livre(String auteur, String titre) {
    this.auteur = auteur;
    this.titre = titre;
  }

  public Livre ( String auteur , String titre , int nbPages){
    this(auteur, titre);
    this.titre = titre;
  }
  
  
  public Livre(String auteur , String titre , int nbPages , double prix){
    this(auteur, titre, nbPages);
    this.setPrix(prix);
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
  public double getPrix(){
     return this.prix;
  }
  public boolean isPrixFixe(){
    if(prixFixe == true){
      return true;
    }
    else{
      return false;
    }
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

  public int compare(Livre x){
    if(x.getNbPages() == this.nbPages()){
      return 0;
    }
    else if (this.nbPages > x.getNbPages()){
      return 1;
    }
    else{
      return -1;
    }
  }

  public void setPrix (double prix){
    if(prix > 0 && this.isPrixFixe() == false){
      this.prix = prix;
      this.prixFixe = true;
    }
    else if (prix > 0 && this.isPrixFixe() == true){
     System.out.println("Le prix a ete deja fixe");
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

  public void afficheToi(){
    String nom = this.toString();
    System.out.println(nom);
  }

  public String toString(){
    if(this.prixFixe == false){
      return "Prix n'est pas encore donne";
    }
    else{
    return  this.titre + "," + this.auteur + "," + this.nbPages + "," + this.prix  ;
    }
  }
}