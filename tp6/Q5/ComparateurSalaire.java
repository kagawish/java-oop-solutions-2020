package eg.ufe.kagawish.abrbinaire;

import java.util.Comparator;

public class ComparateurSalaire implements Comparator<Employe> {

	@Override
	public int compare(Employe e1, Employe e2) {
		if (e1.getSalaire() > e2.getSalaire()) {
			return 1;
		}

		if (e2.getSalaire() > e1.getSalaire()) {
			return -1;
		}

		return 0;
	}
}
