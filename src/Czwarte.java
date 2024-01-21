public class Czwarte {
   /* Napisz program w którym jest zmienna 'w'. Zmienna ta oznacza wysokość choinki.
   Program wyświetla na ekranie wypisaną choinkę o danej wysokości. Przykłady:

dla w = 3 program wypisuje
  *
 ***
*****
pierwszy wiersz to: spacja spacja gwiazdka spacja spacja
drugi wiersz to: spacja gwiazdka gwiazdka gwiazdka spacja
trzeci wiersz to: gwiazdka gwiazdka gwiazdka gwiazdka gwiazdka
dla w = 5
    *
   ***
  *****
 *******
*********
    */
    public static void main(String[] args) {
        int wysokoscChoinki = 5; // Zmień tę wartość, aby dostosować wysokość choinki

        for (int i = 0; i < wysokoscChoinki; i++) {
            // Wypełnij wiersz spacjami
            for (int j = 0; j < wysokoscChoinki - i - 1; j++) {
                System.out.print(" ");
            }

            // Dodaj gwiazdki
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Przejdź do nowej linii
            System.out.println();
        }
    }
}


