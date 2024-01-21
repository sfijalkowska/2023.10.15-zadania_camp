import java.util.Random;

public class Pierwsze {
    /* Napisz program generujący jednowymiarową tablicę losowych liczb (10 elementów) w której każda liczba jest podzielna przez 7.
    Wynikiem działania programu ma być wyświetlona tablica. Zakres losowych liczb 0 - 100.
     */
    public static void main(String[] args) {
        int[] tabela = new int[10];
        Random losowacz = new Random();

        for (int i = 0; i < 10; i++) {
            tabela[i] = losowacz.nextInt(0,101);
            while (tabela[i] % 7 !=0){
                tabela [i]= losowacz.nextInt(0, 101);
            }

        }
        System.out.print("Wygenerowana tablica: " );
        for (int i = 0; i < 10; i++) {
            System.out.print(tabela[i] + " ");
        }
    }
}
