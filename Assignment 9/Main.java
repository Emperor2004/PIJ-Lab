class MyThread extends Thread {
    public void run() {
        System.out.println("Threadd Started...");
    }
}

class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}