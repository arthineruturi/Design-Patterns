import java.text.SimpleDateFormat;
import java.util.Date;

public class Singleton {
    private static Singleton instance;
    private String dateOfBirth; 

    private Singleton() {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss.SSS");
        this.dateOfBirth = dateFormat.format(new Date());
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
