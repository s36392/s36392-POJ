public abstract class Pizza implements Comparable<Pizza> {
    private final double calories;
    private final String name;
    private final double price;

    public Pizza(double calories, String name, double price) {
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [name=" + name +
                ", calories=" + calories +
                ", price=" + price + "]";
    }

    @Override
    public int compareTo(Pizza other) {
        return Double.compare(this.price, other.price);
    }
}