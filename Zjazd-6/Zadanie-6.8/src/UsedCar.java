public class UsedCar {
    private String vin;
    private String make;
    private int year;
    private double mileage;
    private double price;

    public UsedCar(String vin, String make, int year, double mileage, double price)
            throws UsedCarException {
        if (vin == null || vin.length() != 4 || !vin.matches("\\d{4}"))
            throw new UsedCarException("Invalid VIN (must be 4 digits): " + vin);

        String[] validMakes = {"Ford", "Honda", "Toyota", "Chrysler", "Other"};
        boolean validMake = false;
        for (String m : validMakes)
            if (m.equals(make)) { validMake = true; break; }
        if (!validMake)
            throw new UsedCarException("Invalid make: " + make);

        if (year < 1997 || year > 2017)
            throw new UsedCarException("Invalid year (1997–2017): " + year);

        if (mileage < 0)
            throw new UsedCarException("Negative mileage: " + mileage);

        if (price < 0)
            throw new UsedCarException("Negative price: " + price);

        this.vin = vin;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "VIN=" + vin + ", make=" + make + ", year=" + year
                + ", mileage=" + mileage + ", price=" + price;
    }
}