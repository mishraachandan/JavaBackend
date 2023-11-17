package week1.singleton.implementation;

import java.text.SimpleDateFormat;
import java.util.Date;

// Logger class (Singleton)
public class Logger {
    private static Logger instance;
    private SimpleDateFormat simpleDateFormat;

    private Logger() {
        // Optional: You can add initialization code here
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static Logger getInstance() {
        // Lazy Initialization: Create the instance if it doesn't exist yet
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        String formattedMessage = "[" + getCurrentDateTime() + "] " + message;
        System.out.println("Log: " + formattedMessage);
    }

    private String getCurrentDateTime() {
        Date now = new Date();
        return simpleDateFormat.format(now);
    }
}
