public class PizzaSpecial extends Pizza {
    private final int availableDays;
    private final double discountPercent;

    public PizzaSpecial(double calories, String name, double price) {
        super(calories, name, price);
        this.availableDays  = 7;
        this.discountPercent = 0.0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "discount=" + discountPercent + "%, days=" + availableDays;
    }
}