package org.example.Bai3;

public class Main {
    public static void main(String[] args) {

        // Run Thread
        WorkerThread thread1 = new WorkerThread();
        thread1.start();

        // Run Runnable
        WorkerRunnable task = new WorkerRunnable();
        Thread thread2 = new Thread(task);
        thread2.start();
    }
}
