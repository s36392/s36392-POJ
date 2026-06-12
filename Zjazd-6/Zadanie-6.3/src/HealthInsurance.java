public class HealthInsurance extends Insurance {

    public HealthInsurance() {
        super("Health");
        setCost();
    }

    @Override
    public void setCost() {
        monthlyPrice = HEALTH_INSURANCE_COST;
    }

    @Override
    public void display() {
        System.out.println("Insurance type is: " + getInsuranceType() + " insurance.");
        System.out.println("Monthly cost is: $" + getMonthlyPrice());
    }
}
