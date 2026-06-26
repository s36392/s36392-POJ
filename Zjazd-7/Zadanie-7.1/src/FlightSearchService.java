import java.time.LocalDate;
import java.util.List;

public interface FlightSearchService {
    List<FlightOffer> search(String fromCode, String toCode, LocalDate date);
    String getAirlineName();
}