import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String word) {
        char[] array = new char[100];
        int length = word.length();

        for (int i = 0; i < length; i++) {
            array[i] = word.charAt(i);
        }

        for (int i = 0; i < length / 2; i++) {
            if (array[i] != array[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        scanner.close();

        if (isPalindrome(word)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}