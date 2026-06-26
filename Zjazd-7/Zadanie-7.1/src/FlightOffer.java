import java.time.LocalDateTime;

public class FlightOffer {
    private final String        airline;
    private final String        from;
    private final String        to;
    private final LocalDateTime departureTime;
    private final double        price;
    private final int           stopovers;
    private final int           durationMinutes;

    public FlightOffer(String airline, String from, String to,
                       LocalDateTime departureTime, double price,
                       int stopovers, int durationMinutes) {
        this.airline         = airline;
        this.from            = from;
        this.to              = to;
        this.departureTime   = departureTime;
        this.price           = price;
        this.stopovers       = stopovers;
        this.durationMinutes = durationMinutes;
    }

    public String        getAirline()         { return airline; }
    public String        getFrom()            { return from; }
    public String        getTo()              { return to; }
    public LocalDateTime getDepartureTime()   { return departureTime; }
    public double        getPrice()           { return price; }
    public int           getStopovers()       { return stopovers; }
    public int           getDurationMinutes() { return durationMinutes; }

    @Override
    public String toString() {
        return String.format("%-20s | %s → %s | dep: %s | %6.2f PLN | stops: %d | %d min",
                airline, from, to, departureTime, price, stopovers, durationMinutes);
    }
}