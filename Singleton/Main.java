package Singleton;
import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {
        DateTime dateTimeInstance1 = DateTime.getInstance();
        DateTime dateTimeInstance2 = DateTime.getInstance();
        
        System.out.println(dateTimeInstance1 == dateTimeInstance2); // Output: true
        displayCurrentDateTime(dateTimeInstance1);
        displayCurrentDateTime(dateTimeInstance2);
    }
    
  
    public static void displayCurrentDateTime(DateTime dateTimeInstance) {
        LocalDateTime currentDateTime = dateTimeInstance.getCurrentDateTime();
        System.out.println("Current date and time: " + currentDateTime);
    }
}
