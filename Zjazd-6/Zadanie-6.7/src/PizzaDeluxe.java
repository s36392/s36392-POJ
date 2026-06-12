import java.util.Arrays;

public class PizzaDeluxe extends Pizza {
    private final String[] toppings;
    private final boolean isGlutenFree;
    private final int size;

    public PizzaDeluxe(double calories, String name, double price) {
        super(calories, name, price);
        this.toppings    = new String[]{"mozzarella", "pepperoni", "olives"};
        this.isGlutenFree = false;
        this.size = 32;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | size=" + size + "cm, glutenFree=" + isGlutenFree +
                ", toppings=" + Arrays.toString(toppings);
    }
}