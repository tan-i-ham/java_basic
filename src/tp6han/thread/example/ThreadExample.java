package tp6han.thread.example;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread is running");

        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        Thread.sleep(1);
        System.out.println("Main thread is running after sleep");
    }
}
