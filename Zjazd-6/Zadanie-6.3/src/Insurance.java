public abstract class Insurance {
    private static String insuranceType;
    protected double monthlyPrice;
    public final double LIFE_INSURANCE_COST = 36.0;
    public final double HEALTH_INSURANCE_COST = 196.0;

    public Insurance(String insuranceType) {
        Insurance.insuranceType = insuranceType;
    }

    public static Insurance create(String insuranceType) {
        return switch (insuranceType) {
            case "Life" -> new LifeInsurance();
            case "Health" -> new HealthInsurance();
            default -> throw new IllegalArgumentException("Unknown type: " + insuranceType);
        };
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
