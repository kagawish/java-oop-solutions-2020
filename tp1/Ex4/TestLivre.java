public class TestLivre {

  public static void main(String[] args) {
    Livre l1 = new Livre();
     Livre.c= new Comptable();

    l1.setAuteur("Victor Hugo");
    l1.setTitre("Hello");
    l1.setNbPages(300);
    l1.setPrix(2.8);


    //System.out.println(l1);

    Livre l2 = new Livre("Naguib Mhafouz", "Bien El Kasrein");
    l2.setNbPages(200);
    //System.out.println(l2);

    Livre l3 = new Livre("Charles Dickens", "My book Name", 400);
    l3.setPrix(2.7);
    //System.out.println(l3);

    Livre l4 = new Livre("Taha Hussein", "El Ayam", 250, 20);
    //System.out.println(l4);

    //System.out.println(l1.compare(l2));
    //System.out.println(Livre.compare2(l1, l2));

    Comptable c = new Comptable();
    c.comptabiliser(l1);
    



    


    System.out.println(Livre.c.getPrixTotale());
    //System.out.println(c2.getPrixTotale());
  }
}
