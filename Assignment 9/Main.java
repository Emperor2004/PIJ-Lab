class MyThread implements Runnable {
    public void run() {
        System.out.println("Threadd Started...");
    }
}

class Main {
    public static void main(String[] args) {
        // MyThread t = new MyThread();
        // t.start();
        new Thread(new MyThread()).start();
    }
}