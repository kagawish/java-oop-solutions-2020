/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.ufe.karim.entreprise;

/**
 *
 * @author karim
 */
public class TestEntreprise {
  public static void main(String[] args) throws EmployeException {
    Entreprise e1 = new Entreprise("IBM");
    Entreprise e2 = new Entreprise("Sun");
//    System.out.println("Engager Dupond chez IBM");
//    Employe emp1 = new Employe("Dupond");
//    e1.engager(emp1);
//    System.out.println(e1);
//    System.out.println(e2);
//    System.out.println("Engager Poiret chez Sun");
//    e2.engager(new Employe("Poiret"));
//    System.out.println(e1);
//    System.out.println(e2);
//    System.out.println("Engager Ravier et Burot chez Sun");
//    e2.engager(new Employe("Ravier"));
//    e2.engager(new Employe("Burot"));
//    System.out.println(e1);
//    System.out.println(e2);

      Employe emp1 = new Employe("Jean");
      Employe emp2 = new Employe("Marc");
      Employe emp3 = new Employe("Jean");

      e1.engager(emp1);
      e1.engager(emp2);
      
      System.out.println(e1);
      
//      e1.degager(emp1);
//      e1.degager(emp3);
  }
}