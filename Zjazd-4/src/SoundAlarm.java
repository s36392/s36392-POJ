public class SoundAlarm implements Alarm {

    private Logger logger;

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        System.out.println("ALARM ALARM ALARM. Alarm odplaony: "
                + pinEvent.getEventDate());
        if (logger != null) {
            logger.logMessage(Severity.HIGH, "SoundAlarm", "Alarm wlaczony. Data i czas: "
                    + pinEvent.getEventDate());
        }
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        System.out.println("Alarm dzwiekowy wylaczony: "
                + pinEvent.getEventDate());
        if (logger != null) {
            logger.logMessage(Severity.LOW, "SoundAlarm", "Alarm wylaczony. Data i czas: "
                    + pinEvent.getEventDate());
        }
    }
}