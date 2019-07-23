package guide15;

public class Logger {

    private String log;
    private int count;

    private static Logger loggerInstance;

    private Logger(String log) {
        this.log = log;
    }

    private Logger() {
        log = "[LOGGER] Started";
    }

    public static Logger getLoggerInstance() {
        return (loggerInstance == null) ? loggerInstance = new Logger() : loggerInstance;
    }

    public void log(String message) {
        log = count + "[LOGGER]" + "\t" + message;
        count++;

    }

    public void getLog() {
        System.out.println(log);
    }
}
