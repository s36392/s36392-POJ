public class HealthInsurance extends Insurance {

    public HealthInsurance(){
        super("HealthInsurance");
        setCost();
    }

    @Override
    public void setCost(){
        monthlyPrice = 196.0;
    }

    @Override
    public void display() {
        System.out.println("Insurance type is: " + getInsuranceType());
        System.out.println("Monthly cost is: $" + getMonthlyPrice());
    }
}
