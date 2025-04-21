/*
 Name: Om Narayan Pandit
 PRN: 23070126083
 Batch: AIML B1
*/

// Main.java
public class Main {
    public static void main(String[] args) {
        // Log the start of the main thread
        System.out.println("Main thread started.");
                
        // Create two MyThread instances with unique names
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");
        
        // Start both threads; they will execute run() concurrently
        thread1.start();
        thread2.start();

        // Log that the main thread has finished its own execution
        // Note: child threads may still be running after this line
        System.out.println("Main thread ended.");
    }
}