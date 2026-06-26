import java.time.LocalDate;
import java.util.List;

public class UAFlightAdapter implements FlightSearchService {
    private final UATicketService service;

    public UAFlightAdapter(UATicketService service) {
        this.service = service;
    }

    @Override
    public List<FlightOffer> search(String fromCode, String toCode, LocalDate date) {
        return service.getTicketInfo(fromCode, toCode, date)
                .stream()
                .map(t -> new FlightOffer(
                        getAirlineName(),
                        t.from, t.to, t.dateTime,
                        t.price, t.stopovers, t.durationMinutes))
                .toList();
    }

    @Override
    public String getAirlineName() { return "United Airlines"; }
}