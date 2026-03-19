import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 diffrent numbers:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a>b & a>c){
            if (b>c){
                System.out.print(a + " " + b + " " + c + " ");
                System.out.print(c + " " + b + " " + a + " ");
            } else {
                System.out.print(b + " " + c + " " + a + " ");
                System.out.print(a + " " + c + " " + b + " ");
            }
        } else if (b>a & b>c) {
            if (a>c){
                System.out.print(c + " " + a + " " + b + " ");
                System.out.print(b + " " + a + " " + c + " ");
            } else {
                System.out.print(a + " " + c + " " + b + " ");
                System.out.print(b + " " + c + " " + a + " ");
            }
        } else if (c>a & c>b) {
            if (a>b){
                System.out.print(b + " " + a + " " + c + " ");
                System.out.print(c + " " + a + " " + b + " ");
            } else {
                System.out.print(a + " " + b + " " + c + "  ");
                System.out.print(c + " " + b + " " + a + " ");
            }
        } else {
            System.out.print("Blad");
        }
        scanner.close();
    }
}