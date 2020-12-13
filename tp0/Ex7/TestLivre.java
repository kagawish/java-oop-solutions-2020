public class TestLivre{
     public static void main(String[] args){
         Livre l1 = new Livre();
        l1.setAuteur("Victor Hugo");
        l1.setTitre("Hello");
        l1.setNbPages(300);
        System.out.println(l1);

        Livre l2 = new Livre("Naguib Mhafouz", "El Ayam");
        l2.setNbPages(200);
        System.out.println(l2);

        Livre l3 = new Livre("Charles Dickens" , "My book Name", 400);
        System.out.println(l3);
}
}