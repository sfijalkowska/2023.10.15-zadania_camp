import java.util.Random;

public class Osme {
    public static void main(String[] args) {
        int [] tab1 = new int[10];
        int [] tab2 = new int[10];
        int [] tab3 = new int[10];
        Random losoweLiczby1 = new Random();

        for (int i=0; i<10; i++) {
            int liczby1 = losoweLiczby1.nextInt(0, 101);
            tab1 [i] = liczby1;
            int liczby2 = losoweLiczby1.nextInt(0, 101);
            tab2 [i] = liczby2;
            tab3 [i] = liczby1 + liczby2;
        }
        System.out.println();
        for (int i=0; i<10; i++){
            System.out.print(tab1[i] + " ");
        }
        System.out.println();
        for (int i=0; i<10; i++){
            System.out.print(tab2[i] + " ");
        }
        System.out.println();
        for (int i=0; i<10; i++){
            System.out.print(tab3[i] + " ");
        }
    }
}
/* Napisz program który losuje dwie tablice (10 elementów, zakres 0 - 100).
Wynikiem działania programu mają być wypisane obie tablice, oraz trzecia tablica w które każdy element jest sumą odpowiadających elementów z dwóch pierwszych tablic.
Przykład:
1 4 4 64 45
23 32 5 23 3
24 36 9 87 48*/
