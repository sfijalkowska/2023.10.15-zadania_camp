import java.util.Random;

public class Szoste {
    public static void main(String[] args) {

        int [] tabela = new int[10];
        int [] tabelaOdwrocona = new int[10];
        Random zakresLiczb = new Random();

        for (int i=0; i<10; i++){
           int liczba = zakresLiczb.nextInt(0, 101);
            tabela[i] = liczba;
        }
        for (int i=0; i<10; i++){
            tabelaOdwrocona[9-i]=tabela[i];
        }
        System.out.print("Tabela");
        for (int i = 0; i<10; i++) {
            System.out.print(tabela[i] + " ");
        }
        System.out.println();
        System.out.print("TabeloOdwrócona");
        for (int i = 0; i<10; i++) {
            System.out.print(tabelaOdwrocona[i] + " ");
        }
    }
}
        /* Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
        Program ma wygenerować druga tablicę która jest pierwszą tablicą w odwrotnej kolejności.
        Wynikiem działania programu ma być wyświetlona pierwsza i druga tablica. Przykłady:
3, 23, 2, 23, 53
53, 23, 2, 23, 3
45, 23, 65, 1, 54
54, 1, 65, 23, 45
Zakres losowych liczb 0 - 100. */