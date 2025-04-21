// MyThread.java
public class MyThread extends Thread {
    // Name of this thread for logging purposes
    private String threadName;

    /**
     * Constructor to set up thread with a descriptive name
     * @param name Thread name to display in console logs
     */
    public MyThread(String name) {
        this.threadName = name;
    }

    /**
     * Entry point of the thread when start() is called.
     * Prints a start message, counts from 1 to 5 with delays, and prints a finish message.
     */
    @Override
    public void run() {
        // Notify that this thread has started running
        System.out.println(threadName + " started running.");
        
        // Perform five iterations, logging the count each time
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                // Sleep for half a second between iterations to simulate work
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle the case where the thread is interrupted during sleep
                System.out.println(threadName + " was interrupted.");
            }
        }

        // Notify that this thread has completed its task
        System.out.println(threadName + " finished.");
    }
}
