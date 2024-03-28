package MutexExample;

class Mutex {
    private boolean isLocked = false;

    public synchronized void lock(String threadName) throws InterruptedException {
        while (isLocked) {
            System.out.println(threadName + " is waiting to acquire the lock.");
            wait(); 
        }
        isLocked = true;
        System.out.println(threadName + " acquired the lock.");
    }

    public synchronized void unlock(String threadName) {
        isLocked = false;
        System.out.println(threadName + " released the lock.");
        notify(); 
    }
}