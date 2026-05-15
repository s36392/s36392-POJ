public class ConsoleLogger implements Logger {

    private final Severity logLevel;

    public ConsoleLogger(Severity logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public void logMessage(Severity severity, String eventSource, String message) {
        if (severity.ordinal() >= logLevel.ordinal()) {
            System.out.println("[" + severity + "] " + eventSource + ": " + message);
        }
    }
}