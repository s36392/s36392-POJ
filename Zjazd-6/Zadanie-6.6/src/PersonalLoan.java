public class PersonalLoan extends Loan {
    public PersonalLoan(int loanNumber,
                        String customerLastName,
                        double amount,
                        int term,
                        double primeRate) {
        super(loanNumber, customerLastName, amount, term);
        setInterestRate(primeRate + 0.02);
    }
}