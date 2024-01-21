import java.util.Random;

public class DrugieRozwiazaniePierwszegoZadania {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random rand = new Random();

        for (int i = 0; i < tablica.length; i++) {
            // Losowanie liczby podzielnej przez 7 z zakresu 0-100
           tablica[i] = (rand.nextInt(15) * 7);

        }

        // Wyświetlanie tablicy
        System.out.print("Wygenerowana tablica: ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
    }
}
/* Napisz program generujący jednowymiarową tablicę losowych liczb (10 elementów) w której każda liczba jest podzielna przez 7.
    Wynikiem działania programu ma być wyświetlona tablica. Zakres losowych liczb 0 - 100.*/
