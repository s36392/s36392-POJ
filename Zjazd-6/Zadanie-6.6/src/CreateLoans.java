void main() {
    Loan[] loans = new Loan[5];

    double primeRate = InputValidation.getDouble("Enter the current prime interest rate (e.g. 0.05 for 5%): ");

    for (int i = 0; i < loans.length; i++) {
        IO.println("\nLoan " + (i + 1) + ":");

        IO.println("1. Business");
        IO.println("2. Personal");
        int type = InputValidation.getLoanType("Loan type: ");

        String lastName = InputValidation.getString("Customer last name: ");
        double amount = InputValidation.getLoanAmount("Loan amount: ");
        int term = InputValidation.getLoanTerm("Term (1, 3, or 5 years): ");

        if (type == 1)
            loans[i] = new BusinessLoan(i + 1, lastName, amount, term, primeRate);
        else
            loans[i] = new PersonalLoan(i + 1, lastName, amount, term, primeRate);
    }

    IO.println("\nAll loans:");
    for (Loan loan : loans) {
        IO.println(loan);
        IO.println();
    }
}