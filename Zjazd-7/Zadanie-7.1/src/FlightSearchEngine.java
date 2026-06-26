import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FlightSearchEngine {
    private final List<FlightSearchService> services = new ArrayList<>();

    public void registerAirline(FlightSearchService service) {
        services.add(service);
        System.out.println("Registered: " + service.getAirlineName());
    }

    public List<FlightOffer> search(String from, String to, LocalDate date) {
        List<FlightOffer> results = new ArrayList<>();
        for (FlightSearchService service : services)
            results.addAll(service.search(from, to, date));
        return results;
    }

    public List<FlightOffer> sortByPrice(List<FlightOffer> offers) {
        return offers.stream().sorted(Comparator.comparingDouble(FlightOffer::getPrice)).toList();
    }

    public List<FlightOffer> sortByStopovers(List<FlightOffer> offers) {
        return offers.stream().sorted(Comparator.comparingInt(FlightOffer::getStopovers)).toList();
    }

    public List<FlightOffer> sortByDuration(List<FlightOffer> offers) {
        return offers.stream().sorted(Comparator.comparingInt(FlightOffer::getDurationMinutes)).toList();
    }

    public List<FlightOffer> filterByMaxPrice(List<FlightOffer> offers, double max) {
        return offers.stream().filter(o -> o.getPrice() <= max).toList();
    }

    public List<FlightOffer> filterByMaxStopovers(List<FlightOffer> offers, int max) {
        return offers.stream().filter(o -> o.getStopovers() <= max).toList();
    }

    public List<FlightOffer> filterByMaxDuration(List<FlightOffer> offers, int maxMinutes) {
        return offers.stream().filter(o -> o.getDurationMinutes() <= maxMinutes).toList();
    }
}