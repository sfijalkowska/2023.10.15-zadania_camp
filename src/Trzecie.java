import java.util.Random;

public class Trzecie {
    /*Napisz program generujący jednowymiarową tablicę (10 elementów) liczb w której każda liczba jest losowa ale nie jest mniejsza niż poprzednia liczba. Przykłady:
23, 34, 53, 60, 80
0, 10, 70, 70, 70
nieprawidłowy wynik:
34, 56, 34, 78, 99 - trzecia liczba jest mniejsza niż poprzednia (druga).
Wynikiem działania programu ma być wyświetlona wygenerowana tablica. Zakres losowych liczb 0 - 20.
     */
    public static void main(String[] args) {
        int[] tabela = new int[10];
        Random losowacz = new Random();
        tabela[0]= losowacz.nextInt(0,101);

        for (int i = 1; i < tabela.length; i++) {
            tabela[i] = losowacz.nextInt(0, 101);
          while (tabela[i] < tabela[i- 1]){
              tabela[i]= losowacz.nextInt(0,101);
          }
            System.out.print(tabela[i] + " ");
        }
    }
}

