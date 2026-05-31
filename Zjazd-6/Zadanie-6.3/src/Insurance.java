import java.util.Objects;

public abstract class Insurance {
    private final String insuranceType;
    protected double monthlyPrice;

    public Insurance(String insuranceType) {
        if (Objects.equals(insuranceType, "LifeInsurance")){
            LifeInsurance lifeInsurance = new LifeInsurance();
        } else {
            HealthInsurance healthInsurance = new HealthInsurance();
        }
        this.insuranceType = insuranceType;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public abstract void setCost();

    public abstract void display();
}
