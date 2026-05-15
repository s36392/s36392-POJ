public class PoliceAlarm implements Alarm {

    private Logger logger;

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        System.out.println("Policja wezwana. data i czas: "
                + pinEvent.getEventDate());
        if (logger != null) {
            logger.logMessage(Severity.HIGH, "PoliceAlarm", "Alarm wlaczony. Data i czas: "
                    + pinEvent.getEventDate());
        }
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        System.out.println("Policja odwolana. Data i czas: "
                + pinEvent.getEventDate());
        if (logger != null) {
            logger.logMessage(Severity.LOW, "Police Alarm", "Alarm wylaczony. Data i czas: "
                    + pinEvent.getEventDate());
        }
    }
}