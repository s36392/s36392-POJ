import java.util.Scanner;

public class InputValidation {
    private static final Scanner scanner = new Scanner(System.in);

    public static double getDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble())
                return scanner.nextDouble();
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
    }

    public static double getLoanAmount(String prompt) {
        while (true) {
            double value = getDouble(prompt);
            if (value <= LoanConstants.MAXIMUM_LOAN_AMOUNT)
                return value;
            System.out.println("Loan amount cannot exceed $" + (int) LoanConstants.MAXIMUM_LOAN_AMOUNT + ".");
        }
    }

    public static int getInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt())
                return scanner.nextInt();
            System.out.println("Invalid input. Please enter a whole number.");
            scanner.next();
        }
    }

    public static int getLoanType(String prompt) {
        while (true) {
            int value = getInt(prompt);
            if (value == 1 || value == 2)
                return value;
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    public static int getLoanTerm(String prompt) {
        while (true) {
            int value = getInt(prompt);
            if (value == LoanConstants.SHORT_TERM || value == LoanConstants.MEDIUM_TERM || value == LoanConstants.LONG_TERM)
                return value;
            System.out.println("Invalid term. Please enter 1, 3, or 5.");
        }
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }
}