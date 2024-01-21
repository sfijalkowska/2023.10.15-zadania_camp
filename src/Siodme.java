import java.util.Random;

public class Siodme {
    public static void main(String[] args) {
        int[] tab1 = new int[10];
        int[] tab2 = new int[10];
        int[] tab3 = new int[20];
        Random losoweElementy = new Random();

        for (int i = 0; i < 10; i++) {
            int liczba1 = losoweElementy.nextInt(0, 101);
            tab1[i] = liczba1;
            int liczba2 = losoweElementy.nextInt(0, 101);
            tab2[i] = liczba2;
            tab3[i] = liczba1;
            tab3[i+10] = liczba2;

        }
        for (int i = 0; i < 10; i++) {
            System.out.print(tab1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(tab2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(tab3[i] + " ");
        }
    }
}
/* 8.Napisz program który generuje dwie tablice (10 elementów) losowych liczb.
Wynikiem działania programu mają być wyświetlone obie tablice oraz trzecia tablica będąca połączeniem dwóch wygenerowanych. Przykład:

3, 5, 12, 34, 45
45, 21, 65, 23, 1
3, 5, 12, 34, 45, 45, 21, 65, 23, 1 */