import java.time.LocalDate;
import java.util.List;

public class BATicketServiceTest implements BATicketService {
    @Override
    public List<BATicket> getTicketInfo(Airport from, Airport to, LocalDate when) {
        return List.of(
                new BATicket(when.atTime( 7, 30), 349.00, 0, 140),
                new BATicket(when.atTime(14,  0), 229.00, 1, 265),
                new BATicket(when.atTime(20, 45), 169.00, 2, 390)
        );
    }
}