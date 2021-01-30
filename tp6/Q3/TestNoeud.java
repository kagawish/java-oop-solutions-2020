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

		ArbreBinaire<Integer> arbre2 = new ArbreBinaire();
		Random randomGenerator = new Random();

		for (int i = 0; i < 20; i++) {
			int x = randomGenerator.nextInt(20);
			arbre2.inserer(x);
		}

		arbre.afficherElements();
		System.out.println(arbre.contient(11));

		System.out.println("==========================");

		// Arbre d'employés
		ArbreBinaire<Employe> abrEmployes = new ArbreBinaire<Employe>(new Employe("Toto"));

		Employe employe = new Employe("Bibi");
		employe.setSalaire(1800);
		abrEmployes.inserer(employe);
		employe = new Employe("Boby");
		employe.setSalaire(2800);
		abrEmployes.inserer(employe);
		employe = new Employe("Tom");
		employe.setSalaire(1700);
		abrEmployes.inserer(employe);
		employe = new Employe("Fred");
		employe.setSalaire(2000);
		abrEmployes.inserer(employe);
		abrEmployes.afficherElements();
		System.out.println(abrEmployes);
		System.out.println("==========================");
	}
}
