<<<<<<< HEAD
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
=======
public class Main {
    public static void main(String[] args) {
           Singleton singletonInstance = Singleton.getInstance();
        String dateOfBirth = singletonInstance.getDateOfBirth();
        System.out.println("Date of Birth: " + dateOfBirth);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

     
        Singleton anotherInstance = Singleton.getInstance();
        String dateOfBirth1 = anotherInstance.getDateOfBirth();
        System.out.println("Date of Birth: " + dateOfBirth1);
        if (singletonInstance == anotherInstance) {
            System.out.println("Both references point to the same Singleton instance.");
        } else {
            System.out.println("References point to different Singleton instances.");
        }
>>>>>>> origin/master
    }
}
