public class PizzaWoogy extends Pizza {
    private final String sauce;
    private final boolean isVegan;
    private final int spiceLevel;

    public PizzaWoogy(double calories, String name, double price) {
        super(calories, name, price);
        this.sauce      = "tomato";
        this.isVegan    = false;
        this.spiceLevel = 1;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | sauce=" + sauce + ", vegan=" + isVegan + ", spice=" + spiceLevel;
    }
}