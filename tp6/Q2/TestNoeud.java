package eg.ufe.kagawish.abrbinaire;

import java.util.Random;

public class TestNoeud {

	public static void main(String[] args) {
		ArbreBinaire<Integer> arbre = new ArbreBinaire();
		arbre.inserer(12);
		System.out.println(arbre);
		arbre.inserer(128);
		System.out.println(arbre);
		arbre.inserer(10);
		System.out.println(arbre);
		arbre.inserer(5);
		System.out.println(arbre);

		System.out.println(arbre.contient(5));
		System.out.println(arbre.contient(28));
	}
}
