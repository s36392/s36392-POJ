import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            System.out.println("BŁĄD");
            scanner.close();
            return;
        }
        int n = scanner.nextInt();

        if (!scanner.hasNextInt()) {
            System.out.println("BŁĄD");
            scanner.close();
            return;
        }
        int m = scanner.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("BŁĄD");
            scanner.close();
            return;
        }

        int[] A = new int[n];
        int[] B = new int[m];

        for (int i = 0; i < n; i++) {
            if (!scanner.hasNextInt()) {
                System.out.println("BŁĄD");
                scanner.close();
                return;
            }
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            if (!scanner.hasNextInt()) {
                System.out.println("BŁĄD");
                scanner.close();
                return;
            }
            B[i] = scanner.nextInt();
        }

        int limit = Math.min(n, m);
        long wynik = 0;

        for (int i = 0; i < limit; i++) {
            wynik += (long) A[i] * B[i];
        }

        System.out.println(wynik);
        scanner.close();
    }
}