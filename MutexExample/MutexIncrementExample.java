package MutexExample;

public class MutexIncrementExample {
    public static void main(String[] args) {
        Mutex mutex = new Mutex();
        
        
        Thread threadA = new IncrementerThread(mutex, 'A');
        Thread threadB = new IncrementerThread(mutex, 'B');

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