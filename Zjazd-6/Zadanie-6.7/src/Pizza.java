public class Pizza implements Comparable {
    private static double calories;
    private static String name;
    private static double price;

    public Pizza (double calories, String name, double price){
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Object pizza) {
        return 0;
    }

    public double getCalories(){
        return calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
