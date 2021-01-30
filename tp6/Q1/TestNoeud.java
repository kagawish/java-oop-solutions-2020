package eg.ufe.kagawish.abrbinaire;

public class TestNoeud {
  public static void main(String[] args) {
    Noeud<Integer> noeud1 = new Noeud<>(12, null, null);
    Noeud<Integer> noeud2 = new Noeud<>(128, noeud1, null);
    System.out.println(noeud2);
  }
}
