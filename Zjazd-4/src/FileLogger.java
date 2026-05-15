import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

    private final Severity logLevel;
    private final String fileName;

    public FileLogger(Severity logLevel, String fileName) {
        this.logLevel = logLevel;
        this.fileName = fileName;
    }

    @Override
    public void logMessage(Severity severity, String eventSource, String message) {
        if (severity.ordinal() >= logLevel.ordinal()) {
            try {
                FileWriter writer = new FileWriter(fileName, true); // true = append, not overwrite
                writer.write("[" + severity + "] " + eventSource + ": " + message + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Could not write to log file: " + e.getMessage());
            }
        }
    }
}