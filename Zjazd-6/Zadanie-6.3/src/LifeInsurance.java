public class LifeInsurance extends Insurance {

    public LifeInsurance() {
        super("Life");
        setCost();
    }

    @Override
    public void setCost() {
        monthlyPrice = LIFE_INSURANCE_COST;
    }

    @Override
    public void display() {
        System.out.println("Insurance type is: " + getInsuranceType() + " insurance.");
        System.out.println("Monthly cost is: $" + getMonthlyPrice());
    }
}
