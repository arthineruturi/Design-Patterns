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
    }
}
