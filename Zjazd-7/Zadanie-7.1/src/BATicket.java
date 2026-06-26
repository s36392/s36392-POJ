import java.time.LocalDateTime;

public class BATicket {
    public final LocalDateTime departureTime;
    public final double        ticketPrice;
    public final int           stopovers;
    public final int           durationMinutes;

    public BATicket(LocalDateTime departureTime, double ticketPrice,
                    int stopovers, int durationMinutes) {
        this.departureTime   = departureTime;
        this.ticketPrice     = ticketPrice;
        this.stopovers       = stopovers;
        this.durationMinutes = durationMinutes;
    }
}