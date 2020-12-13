public class TestLivre{
     public static void main(String[] args){
    Livre l1 = new Livre ("Arthur", "Sherlock Holmes");
    Livre l2 = new Livre ("Victor Hugo", "Les miserables");
    System.out.println(l1.getAuteur());
    System.out.println(l2.getAuteur());
    l1.setNbPages(700);
    System.out.println(l1.getNbPages());

    l2.setNbPages(50);
    System.out.println(l2.getNbPages());

    System.out.println(l1.getNbPages() + l2.getNbPages());
}
}