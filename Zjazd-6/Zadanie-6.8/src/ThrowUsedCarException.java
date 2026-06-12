void main() {
    Object[][] data = {
            {"1234", "Toyota", 2005, 80000.0, 12000.0},  // OK
            {"5678", "Honda", 1999, 50000.0, 8000.0},  // OK
            {"9999", "Ford", 2017, 0.0, 25000.0},  // OK
            {"AB12", "Toyota", 2010, 30000.0, 11000.0},  // incorrect VIN
            {"2222", "Ferrari", 2008, 20000.0, 40000.0},  // invalid brand
            {"3333", "Chrysler", 1990, 15000.0, 5000.0},  // invalid year
            {"4444", "Other", 2000, -50.0, 3000.0},  // invalid mileage
            {"5555", "Honda", 2015, 60000.0, -1000.0},  // invalid price
            {"6666", "Toyota", 2012, 45000.0, 15000.0},  // OK
            {"7777", "Ford", 2000, 99000.0, 7500.0},  // OK
    };

    ArrayList<UsedCar> cars = new ArrayList<>();

    for (Object[] d : data) {
        try {
            UsedCar car = new UsedCar(
                    (String) d[0],
                    (String) d[1],
                    (int) d[2],
                    (double) d[3],
                    (double) d[4]
            );
            cars.add(car);
        } catch (UsedCarException e) {
            IO.println("Exception: " + e.getMessage());
        }
    }

    IO.println("\nSuccessfully created UsedCar objects:");
    for (UsedCar c : cars)
        IO.println("  " + c);
}