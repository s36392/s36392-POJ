public class PoliteAlarm implements Alarm {

    private Logger logger;

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        System.out.println("Prosze nie okradaj mnie, wydalem wszystkie pieniadze na ten sejf.: ");
        if (logger != null) {
            logger.logMessage(Severity.HIGH, "PoliteAlarm", "Start alarmu. Data i czas: "
                    + pinEvent.getEventDate());
        }
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        System.out.println("Dziekuje. ");
        if (logger != null) {
            logger.logMessage(Severity.LOW, "PoliteAlarm", "Alarm odwolany. Data i czas: "
                    + pinEvent.getEventDate());
        }
    }
}