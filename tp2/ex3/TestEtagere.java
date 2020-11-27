import java.util.Arrays;

public class TestEtagere {
  public static void main(String[] args) {
    Livre l1 = new Livre("a1", "t1");
    l1.setNbPages(200);
    l1.setPrix(239.50);

    Livre l2 = new Livre("a2", "t2");
    l2.setNbPages(250);
    l2.setPrix(140);

    Livre l3 = new Livre("a3", "t3");
    l1.setNbPages(300);
    l1.setPrix(159.50);

    Livre l4 = new Livre("a1", "t4");

    Livre l5 = new Livre("a1", "t1");

    Livre l6 = new Livre("a2", "t5");

    Etagere etagere1 = new Etagere(2);
    Etagere etagere2 = new Etagere(3);

    etagere1.ajouter(l1);
    etagere1.ajouter(l2);
    etagere1.ajouter(l3);

    etagere2.ajouter(l1);
    etagere2.ajouter(l4);
    etagere2.ajouter(l5);

    System.out.println(etagere1);
    System.out.println(etagere2);

    // Recherche (vous pouvez passer l'auteur et le titre en paramètre de la commande java)
    String auteur, titre;
    if (args.length == 2) {
      auteur = args[0];
      titre = args[1];
    } else {
      auteur = "a1";
      titre = "t2";
    }
    // int position = etagere1.chercher(titre, auteur);
    // if (position != 0) {
    //   System.out.println(
    //     "Livre d'auteur " + auteur + " et de titre " + titre +" trouvé" +" en position " + position + " sur l'étagère"
    //   );
    //   System.out.println(
    //     "VÃ©rification ; le livre est : " + "\n" + etagere1.getLivre(position)
    //   );
    // } else {
    //   System.out.println(
    //     "Livre d'auteur " + auteur + " et de titre " + titre + " pas trouvé"
    //   );
    // }

    int[] results = etagere2.chercherLivres(titre, auteur);
    System.out.println(Arrays.toString(results));

    Livre[] results2 = etagere2.chercherAuteur(auteur);
    System.out.println(Arrays.toString(results2));
  }
}
