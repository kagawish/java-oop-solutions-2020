package eg.ufe.karim.entreprise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEntreprise {
  public static void main(String[] args) {
    Entreprise e1 = new Entreprise("IBM");
    Entreprise e2 = new Entreprise("Sun");
    e1.engager(new Employe("Dupond", 800));
    e1.engager(new Employe("Poiret", 900));
    e2.engager(new Employe("Ravier", 750));
    e2.engager(new Employe("Burot", 1200));
    e2.engager(new Employe("Terrice", 1000));
    e2.engager(new Employe("Pernaut", 1150));
    System.out.println(e1);
    System.out.println(e2);
    
    // Q1
    double total1 = 0;
    Iterator<Employe> it1 = e1.iterEmployes();
    while(it1.hasNext()) {
        Employe emp = it1.next();
        total1 += emp.getSalaire();
    }
    System.out.println(total1);
    
    double total2 = 0;
    Iterator<Employe> it2 = e2.iterEmployes();
    while(it2.hasNext()) {
        Employe emp = it2.next();
        total2 += emp.getSalaire();
    }
    System.out.println(total2);
    
    // Q2
    double total3 = 0;
    for (Employe emp : e1) {
        total3 += emp.getSalaire();
    }

    // Q3
    List<Employe> listEmployes = new ArrayList<>();
    listEmployes.add(new Employe("Dupond", 800));
    listEmployes.add(new Employe("Burot", 1200));
    listEmployes.add(new Employe("Poiret", 900));
    System.out.println(listEmployes);
    listEmployes.sort(null);
    System.out.println(listEmployes);
    
    // Q4
    
    List<Employe2> listEmployes2 = new ArrayList<>();
    listEmployes2.add(new Employe2("Dupond", 800));
    listEmployes2.add(new Employe2("Burot", 1200));
    listEmployes2.add(new Employe2("Poiret", 900));
    System.out.println(listEmployes2);
    
    EmployeComparator comp = new EmployeComparator(true);    
    listEmployes2.sort(comp);
    System.out.println(listEmployes2);
    
    EmployeComparator comp2 = new EmployeComparator(false);
    listEmployes2.sort(comp2);
    System.out.println(listEmployes2);

    // Q5
    List<Employe> employes = new ArrayList<>();
    for (Employe e : e1) {
        employes.add(e);
    }
    for (Employe e : e2) {
        employes.add(e);
    }
    employes.sort(null);
    System.out.println(employes);
  }
}
