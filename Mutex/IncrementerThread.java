package Mutex;



public class IncrementerThread extends Thread {
    private static int counter = 5; 
    private char threadIdentifier;

    public IncrementerThread(char threadIdentifier) {
        this.threadIdentifier = threadIdentifier;
    }

    public void run() {
        if (counter == 5) {
            counter++; 
            System.out.println("Thread " + threadIdentifier + " incremented counter to " + counter);
        } else {
            System.out.println("Thread " + threadIdentifier + " skipped incrementing counter.");
        }

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getCounter() {
        return counter;
    }
}
