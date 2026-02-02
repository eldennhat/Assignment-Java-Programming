package org.example.Bai1;

public class Test1 {
    public static void main(String[] args) {
        //khoi chay ca hai trong main
        //use WorkerThread
        WorkerThread thread1 = new WorkerThread();
        thread1.start();
        //use WorkerRunnable
        WorkerRunnable runnableTask = new WorkerRunnable();
        // runnable chi la mot task, can mot Thread object to run
        Thread thread2 = new Thread(runnableTask);
        thread2.start();
    }
}
