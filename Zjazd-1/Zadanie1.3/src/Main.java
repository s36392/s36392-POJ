import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.next();
        String word2 = scanner.next();

        System.out.print("%");
        System.out.print(word2);
        System.out.print(" ");
        System.out.print(word1);
        System.out.print("%");
        scanner.close();
    }
}