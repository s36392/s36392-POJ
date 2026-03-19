import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String word) {
        char[] tablica = new char[100];
        int dlugosc = word.length();

        for (int i = 0; i < dlugosc; i++) {
            tablica[i] = word.charAt(i);
        }

        for (int i = 0; i < dlugosc / 2; i++) {
            if (tablica[i] != tablica[dlugosc - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        scanner.close();

        if (isPalindrome(word)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}