package Singleton;

import java.time.LocalDateTime;

public class DateTime {
    private static DateTime instance;
    private LocalDateTime currentDateTime;
    
    // Private constructor to prevent instantiation from outside
    private DateTime() {
        // Initialize the currentDateTime when the instance is created
        this.currentDateTime = LocalDateTime.now();
    }
    
    // Method to get the singleton instance
    public static DateTime getInstance() {
        if (instance == null) {
            instance = new DateTime();
        }
        return instance;
    }
    
    // Method to retrieve the current date and time
    public LocalDateTime getCurrentDateTime() {
        return currentDateTime;
    }
}
