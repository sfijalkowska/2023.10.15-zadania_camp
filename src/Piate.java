import java.util.Random;

public class Piate {
    /* Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
    Wynikiem działania programu ma być wygenerowana tablica oraz ilość powtórzeń liczby 5. Zakres losowych liczb 0 - 10.
     */
    public static void main(String[] args) {
int[] tabela = new int[10];
        Random losowacz = new Random();
        int liczPiatki = 0;
        for (int i = 0; i < tabela.length; i++) {
            int liczba = losowacz.nextInt(0, 11);
            tabela[i] = liczba;


            if (liczba == 5){
                liczPiatki++;
            }
        }
        System.out.print("Wygenerowana tablica: " );
        for (int i = 0; i < 10; i++) {
            System.out.print(tabela[i] + " ");
        }
        System.out.println("Ilość piątek :" + liczPiatki);
    }
}
