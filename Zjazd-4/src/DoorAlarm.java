public class DoorAlarm implements Alarm {

    private Logger logger;

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        System.out.println("Drzwi zablokowane. Data i czas: "
                + pinEvent.getEventDate());
        if (logger != null) {
            logger.logMessage(Severity.HIGH, "DoorAlarm", "Drzwi zablokowane. Data i czas:"
                    + pinEvent.getEventDate());
        }
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        System.out.println("Drzwi odblokowane: "
                + pinEvent.getEventDate());
        if (logger != null) {
            logger.logMessage(Severity.LOW, "DoorAlarm", "Drzwi odblokowane. Data i czas: "
                    + pinEvent.getEventDate());
        }
    }
}