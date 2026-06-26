import java.time.LocalDate;
import java.util.List;

public class UATicketServiceTest implements UATicketService {
    @Override
    public List<UATicketInfo> getTicketInfo(String from, String to, LocalDate when) {
        return List.of(
                new UATicketInfo(from, to, when.atTime( 6,  0), 299.99, 0, 150),
                new UATicketInfo(from, to, when.atTime(12,  0), 189.99, 1, 280),
                new UATicketInfo(from, to, when.atTime(18,  0), 139.99, 2, 400)
        );
    }
}