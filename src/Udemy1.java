public class Udemy1 {
    public static void main(String[] args) {
        int[] liczby = {1, 12, 41, 12, 51, 12};

        int suma = 0;

        for (int i = 0; i < liczby.length; i++) {
            System.out.println(liczby[i] + " ");

        suma = suma + liczby[i];
        }

        System.out.println("suma: " +suma);

    }
}
