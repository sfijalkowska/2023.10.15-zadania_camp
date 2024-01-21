import java.util.Random;

public class Drugie {
    /* Napisz program generujący dwuwymiarową tablice (5x5) losowych liczb.
    Wynikiem działania programu ma być wyświetlona tablica oraz najmniejsza liczba z tej tablicy. Zakres losowych liczb 0 - 100
     */
    public static void main(String[] args) {
        int[][] tablica = new int[5][5];
        Random rand = new Random();
        int min = Integer.MAX_VALUE; // Zmienna przechowująca najmniejszą wartość, zainicjowana największą możliwą wartością

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int losowaLiczba = rand.nextInt(0,101); // Losowa liczba w zakresie 0-100
                tablica[i][j] = losowaLiczba;

                // Aktualizacja najmniejszej liczby, jeśli znajdziemy mniejszą
                if (losowaLiczba < min) {
                    min = losowaLiczba;
                }
            }
        }

        System.out.println("Wygenerowana tablica:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Najmniejsza liczba w tablicy: " + min);
    }

}
