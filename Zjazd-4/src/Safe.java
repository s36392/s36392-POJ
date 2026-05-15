import java.util.ArrayList;
import java.util.List;

public class Safe {
    private String pin;
    private List<Alarm> alarms;

    public Safe(String pin) {
        this.pin = pin;
        this.alarms = new ArrayList<>();
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    public void removeAlarm(Alarm alarm) {
        alarms.remove(alarm);
    }

    public void enterPin(String enteredPin) {
        if (enteredPin.equals(pin)) {
            correctPin();
        } else {
            wrongPin();
        }
    }

    private void correctPin() {
        System.out.println("Poprawny PIN");
    }

    private void wrongPin() {
        System.out.println("Bledny PIN");
        PinEvent event = new PinEvent(this);
        for (Alarm alarm : alarms) {
            alarm.alarmTurnOn(event);
        }
    }

    public void resetAlarm() {
        PinEvent event = new PinEvent(this);
        for (Alarm alarm : alarms) {
            alarm.alarmTurnOff(event);
        }
    }
}