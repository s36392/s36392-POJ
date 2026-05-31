import java.util.Scanner;

public class UseInsurance {
    public void main(){
        InputValidation userInput = new InputValidation();
        Scanner scanner = new Scanner(System.in);
        final String prompt = "Select your insurance type: \n1.Life Insurance\n2.Health Insurance";

        Insurance insurance = new Insurance(userInput.getUserInput(scanner, prompt)) {
            @Override
            public void setCost() {

            }

            @Override
            public void display() {

            }
        };
    }
}
