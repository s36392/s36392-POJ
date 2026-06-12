void main() {

    Pizza[] pizzas = new Pizza[40];

    String[] deluxeNames = {"Quattro", "Royale", "Imperial", "Classico", "Supremo",
            "Rustica", "Toscana", "Adriatica", "Venezia", "Margherita",
            "Siciliana", "Romana", "Calabrese", "Napoli"};
    String[] specialNames = {"Weekend", "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday", "1 for 2", "Autumn",
            "Winter", "Spring", "Summer"};
    String[] woogyNames = {"Woogy1", "Woogy2", "Woogy3", "Woogy4", "Woogy5",
            "Woogy6", "Woogy7", "Woogy8", "Woogy9", "Woogy10",
            "Woogy11", "Woogy12", "Woogy13"};

    int index = 0;

    for (int i = 0; i < 14; i++) {
        double price = Math.round((8.99 + i * 1.50) * 100.0) / 100.0;
        double calories = 600 + i * 30;
        pizzas[index++] = new PizzaDeluxe(calories, deluxeNames[i], price);
    }

    for (int i = 0; i < 13; i++) {
        double price = Math.round((7.49 + i * 1.25) * 100.0) / 100.0;
        double calories = 550 + i * 25;
        pizzas[index++] = new PizzaSpecial(calories, specialNames[i], price);
    }

    for (int i = 0; i < 13; i++) {
        double price = Math.round((6.99 + i * 1.10) * 100.0) / 100.0;
        double calories = 500 + i * 20;
        pizzas[index++] = new PizzaWoogy(calories, woogyNames[i], price);
    }

    IO.println("BEFORE SORTING: ");
    for (Pizza p : pizzas) IO.println(p);

    Arrays.sort(pizzas);

    IO.println("AFTER SORTING:");
    for (Pizza p : pizzas) IO.println(p);
}