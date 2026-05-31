import java.util.Scanner;

public class InputValidation {
    public String getUserInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Not a number");
                scanner.next();
                System.out.println(prompt);
            } else {
                int input = scanner.nextInt();  // read once
                if (input == 1) return "Life";
                if (input == 2) return "Health";
                System.out.println("Invalid choice, enter 1 or 2");
                System.out.println(prompt);
            }
        }
    }
}
