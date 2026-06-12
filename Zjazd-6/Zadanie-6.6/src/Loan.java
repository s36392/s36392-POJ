public abstract class Loan implements LoanConstants {
    private final int loanNumber;
    private final String customerLastName;
    private final double amount;
    private double interestRate;
    private final int term;

    public Loan(int loanNumber, String customerLastName, double amount, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        this.amount = amount;

        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM)
            this.term = SHORT_TERM;
        else
            this.term = term;
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public double getTotalOwed() {
        return amount + (amount * interestRate * term);
    }

    @Override
    public String toString() {
        return COMPANY_NAME + "\n" +
                "Loan number: " + loanNumber + "\n" +
                "Customer: " + customerLastName + "\n" +
                "Loan amount: $" + String.format("%.2f", amount) + "\n" +
                "Interest rate: " + String.format("%.2f", interestRate * 100) + "%" + "\n" +
                "Term: " + term + " year(s)\n" +
                "Total owed at due date: $" + String.format("%.2f", getTotalOwed());
    }
}