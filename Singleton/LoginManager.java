package Singleton;

public class LoginManager {
    private static LoginManager instance;
    private static boolean IsInUse = false;
    private String loggedInUser;

    private LoginManager() {
        
    }

    public static synchronized LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }

    public boolean login(String username) {
        if (LoginManager.IsInUse== false) {
            loggedInUser = username;
            LoginManager.IsInUse= true;
            System.out.println("User '" + username + "' logged in successfully.");
            return true;
        }
        else {
            System.out.println("Another user is already logged in.");
            return false;
        }
    }

    public void logout() {
        if (true==LoginManager.IsInUse ) { 
            System.out.println("User '" + loggedInUser + "' logged out.");
            LoginManager.IsInUse= false;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }
}
