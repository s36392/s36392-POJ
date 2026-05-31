import java.util.Scanner;

public class InputValidation {
    public String getUserInput(Scanner scanner, String prompt){
        System.out.println(prompt);
        while (true) {
            if(!scanner.hasNextInt()){
                System.out.println("Not a number");
                scanner.next();
                System.out.println(prompt);
            }
            if(scanner.nextInt() == 1){
                return "LifeInsurance";
            }
            if (scanner.nextInt() == 2){
                return "HealthInsurance";
            }
        }
    }
}

