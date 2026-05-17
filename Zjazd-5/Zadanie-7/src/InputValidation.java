import java.util.Scanner;

public class InputValidation {
    public double getUserInputDouble(Scanner scanner, String prompt) {
        double value;
        System.out.println(prompt);
        while (!(scanner.hasNextDouble())) {
            System.out.println("Not a number, please try again.");
            scanner.next();
            System.out.println(prompt);
        }
        value = scanner.nextDouble();
        return value;
    }
    public int getUserInputInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Not a number, please try again.");
                scanner.next();
                System.out.println(prompt);
            } else {
                int value = scanner.nextInt();
                if (value > 0) {
                    return value;
                }
                System.out.println("Invalid, number must be positive.");
                System.out.println(prompt);
            }
        }
    }
}
