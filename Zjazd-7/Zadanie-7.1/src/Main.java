import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlightSearchEngine engine = new FlightSearchEngine();

        engine.registerAirline(new UAFlightAdapter(new UATicketServiceTest()));
        engine.registerAirline(new BAFlightAdapter(new BATicketServiceTest()));

        String    from = "WAW";
        String    to   = "LHR";
        LocalDate date = LocalDate.of(2025, 8, 15);

        System.out.println("\nAll offers: " + from + " → " + to + " on " + date + " ===");
        List<FlightOffer> all = engine.search(from, to, date);
        all.forEach(System.out::println);

        System.out.println("\nSorted by price");
        engine.sortByPrice(all).forEach(System.out::println);

        System.out.println("\nSorted by stopovers");
        engine.sortByStopovers(all).forEach(System.out::println);

        System.out.println("\nSorted by flight duration");
        engine.sortByDuration(all).forEach(System.out::println);

        System.out.println("\nDirect flights only (0 stopovers)");
        engine.filterByMaxStopovers(all, 0).forEach(System.out::println);

        System.out.println("\nUnder 250 PLN");
        engine.filterByMaxPrice(all, 250.0).forEach(System.out::println);

        System.out.println("\nMax 300 min flight, sorted by price");
        engine.sortByPrice(engine.filterByMaxDuration(all, 300)).forEach(System.out::println);
    }
}