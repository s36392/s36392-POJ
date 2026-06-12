void main() {
    InputValidation userInput = new InputValidation();
    Scanner scanner = new Scanner(System.in);
    final String prompt = "Select your insurance type:\n1. Life Insurance\n2. Health Insurance";

    Insurance insurance = Insurance.create(userInput.getUserInput(scanner, prompt));
    insurance.display();
    scanner.close();
}
