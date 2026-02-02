package org.example.Bai2;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("---Start running 5 Threads---");

        //create a for loop to initialize 5 threads
        for(int i = 1; i <= 5; i++) {
            Runnable task = new PrintTask();
            Thread thread = new Thread(task, "Thread-" + i);
            thread.start();
        }
    }
}
