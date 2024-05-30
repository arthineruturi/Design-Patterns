package Singleton;
public class Main {
    public static void main(String[] args) {
        LoginManager loginManager1 = LoginManager.getInstance();
        LoginManager loginManager2 = LoginManager.getInstance();

        System.out.println(loginManager1 == loginManager2);  
        
        loginManager1.login("user1"); 
        loginManager2.login("user2");  

        loginManager1.logout();  
        loginManager2.login("user2");  
    }
}
