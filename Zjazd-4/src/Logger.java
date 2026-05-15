public interface Logger {

    void logMessage(Severity severity, String eventSource, String message);
}