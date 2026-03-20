import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a and b:");
        while (!scanner.hasNextDouble()){
            System.out.println("BŁĄD, Podaj poprwane dane:");
            scanner.next();
        }
        double a = scanner.nextDouble();
        while (!scanner.hasNextDouble()){
            System.out.println("BŁĄD, Podaj poprwane dane:");
            scanner.next();
        }
        double b = scanner.nextDouble();

        double area = (a * b) / 2;

        System.out.println("Area of a right triangle is: ");
        System.out.println(area);

        scanner.close();
    }
}