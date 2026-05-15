import java.time.LocalDate;
import java.time.LocalDateTime;

public class PinEvent {
    private Safe safe;
    public LocalDateTime eventDate;

    public PinEvent(Safe safe){
        this.safe = safe;
        this.eventDate = LocalDateTime.now();
    }

    public Safe getSafe(){
        return safe;
    }
    public LocalDateTime getEventDate(){
        return eventDate;
    }
}