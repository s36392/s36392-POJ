import java.time.LocalDateTime;

public class UATicketInfo {
    public final String        from;
    public final String        to;
    public final LocalDateTime dateTime;
    public final double        price;
    public final int           stopovers;
    public final int           durationMinutes;

    public UATicketInfo(String from, String to, LocalDateTime dateTime,
                        double price, int stopovers, int durationMinutes) {
        this.from            = from;
        this.to              = to;
        this.dateTime        = dateTime;
        this.price           = price;
        this.stopovers       = stopovers;
        this.durationMinutes = durationMinutes;
    }
}