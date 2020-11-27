import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] entiers = new int[10];

        init(entiers, 9);

        afficher(entiers);

        System.out.println(total(entiers, 9));
    }

    public static void init(int[] ent, int n) {
        Random r = new Random();

        for(int i = 0; i < ent.length; i++) {
            ent[i] = r.nextInt(n) + 1;
        }
    }

    public static void afficher(int[] ent) {
        System.out.println(Arrays.toString(ent));
    }

    public static int total(int[] ent, int n) {
        int somme = 0;
        for (int x : ent) {
            if (x == n) {
                break;
            }
            if (x % 2 != 0) {
                somme += x;
            }
        }
        return somme;
    }
}