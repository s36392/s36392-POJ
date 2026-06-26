import java.time.LocalDate;
import java.util.List;

public class BAFlightAdapter implements FlightSearchService {
    private final BATicketService service;

    public BAFlightAdapter(BATicketService service) {
        this.service = service;
    }

    @Override
    public List<FlightOffer> search(String fromCode, String toCode, LocalDate date) {
        return service.getTicketInfo(new Airport(fromCode), new Airport(toCode), date)
                .stream()
                .map(t -> new FlightOffer(
                        getAirlineName(),
                        fromCode, toCode, t.departureTime,
                        t.ticketPrice, t.stopovers, t.durationMinutes))
                .toList();
    }

    @Override
    public String getAirlineName() { return "British Airways"; }
}