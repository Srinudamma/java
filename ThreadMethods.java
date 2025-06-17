class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is running");
            Thread.sleep(2000);
            System.out.println("Thread is done executing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        // Using isAlive()
        if (t.isAlive()) {
            System.out.println("Thread is still running");
        } else {
            System.out.println("Thread has finished execution");
        }

        // Using join()
        try {
            System.out.println("Waiting for thread to finish...");
            t.join();
            System.out.println("Thread has finished execution after joining");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After join
        
    }
}
