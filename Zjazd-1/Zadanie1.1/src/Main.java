import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a and b:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double area = (a * b) / 2;

        System.out.println("Area of a right triangle is: ");
        System.out.println(area);

        scanner.close();
    }
}