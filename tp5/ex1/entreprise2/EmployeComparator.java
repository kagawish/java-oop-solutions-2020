package eg.ufe.karim.entreprise2;

import java.util.Comparator;

public class EmployeComparator implements Comparator<Employe2> {
    private boolean isCroissant;
    
    public EmployeComparator(boolean isCroissant) {
        this.isCroissant = isCroissant;
    }
    
    @Override
    public int compare(Employe2 e1, Employe2 e2) {
        if (e1.getSalaire() > e2.getSalaire()) {
            if (this.isCroissant == true) {
                return 1;
            } else {
                return -1;
            }
        } else if (e1.getSalaire() < e2.getSalaire()) {
            if (this.isCroissant == true) {
                return -1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
