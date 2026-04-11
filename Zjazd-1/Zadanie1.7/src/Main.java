import java.util.Scanner;

public class Main {
    public static int getInput(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number <= 0){
            System.out.println("Podaj liczbe naturalna:");
            number = scanner.nextInt();
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 1-sza liczbe naturalne:");
        int n = getInput();
        System.out.println("Podaj 2-ga liczbe naturalne:");
        int m = getInput();


    }
}