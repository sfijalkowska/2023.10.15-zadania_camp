public class Dziewiate {
    public static void main(String[] args) {
    int s = 3;
    int k = 5;
    int n = 4;
    int suma = 0;

        // Obliczanie i wypisywanie elementów ciągu
        System.out.print("Elementy ciągu: ");
        for (int i = 0; i < n; i++) {
            int element = s + i * k;
            System.out.print(element + " ");
            suma += element;
        }

        // Wypisywanie sumy elementów ciągu
        System.out.println("\nSuma elementów ciągu: " + suma);

    }
}
/* Napisac program w którym są 3 zmienne:
s - liczba całkowita - oznacza pierwszą liczbę ciągu arytmetycznego
k - liczba całkowita - oznacza krok w ciągu arytmetycznym
n - liczba całkowita - oznacza ilość elementów ciągu.
Program ma zwracać sumę elementów takiego ciągu. Przykład:
s = 3, k = 5, n = 4
program ma wygenerować 4 elementy (n), które wyglądają dla podanych s i k tak:
3, 8, 13, 18
następnie je sumuje i podaje wynik: 42.
Info o tym jak działa ciąg arytmetyczny jest na wikipedii :)*/