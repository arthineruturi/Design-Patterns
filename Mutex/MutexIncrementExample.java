package Mutex;

public class MutexIncrementExample {
    public static void main(String[] args) {
        Thread threadA = new IncrementerThread('A');
        Thread threadB = new IncrementerThread('B');

        threadA.start();
        threadB.start();
        
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + IncrementerThread.getCounter());
    }
}
