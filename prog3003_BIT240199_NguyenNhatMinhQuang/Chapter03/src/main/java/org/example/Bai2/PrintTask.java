package org.example.Bai2;

public class PrintTask implements Runnable {
    @Override
    public void run() {
        for(int j = 1; j <= 10; j++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + ": " + j);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
