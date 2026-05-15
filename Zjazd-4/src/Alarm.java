public interface Alarm {

    void setLogger(Logger logger);

    void alarmTurnOn(PinEvent pinEvent);

    void alarmTurnOff(PinEvent pinEvent);
}