package MutexExample;

class IncrementerThread extends Thread {
	 private Mutex mutex;
	    private static int counter = 5; 
	    private char threadIdentifier;

	    public IncrementerThread(Mutex mutex, char threadIdentifier) {
	        this.mutex = mutex;
	        this.threadIdentifier = threadIdentifier;
	    }

	    public void run() {
	        try {
	            mutex.lock("Thread " + threadIdentifier);
	            
	            counter++; 
	            System.out.println("Thread " + threadIdentifier + " incremented counter to " + counter);
	            Thread.sleep(1000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            mutex.unlock("Thread " + threadIdentifier);
	        }

	        
	        try {
	            Thread.sleep(500); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    public static int getCounter() {
	        return counter;
	    }
}


