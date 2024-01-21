import java.util.Random;

public class DrugieZadanieTrzeciegoZadania {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random rand = new Random();

        for (int i = 1; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(0,21 - tablica[i-1]) + tablica[i-1];
        }
        for (int i = 1; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
    }
}

