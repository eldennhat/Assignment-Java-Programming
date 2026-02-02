package org.example.Bai4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("Starting processing the order...");
        long startTime = System.currentTimeMillis();
        //1.Check tinh kha dung cua san pham
        CompletableFuture<String> checkInventory = CompletableFuture.supplyAsync(() -> {
            System.out.println("Inventory: Checking... (" + Thread.currentThread().getName() + ")");
            sleep(1000); //1s
            System.out.println("Inventory: Products are available!");
            return "OK!";
        });

        //2. Thanh toan
        CompletableFuture<String> processPayment = CompletableFuture.supplyAsync(() -> {
            System.out.println("Payment: Processing payment... (" + Thread.currentThread().getName() + ")");
            sleep(2000); //2s
            System.out.println("Payment: Complete payment!");
            return "Paid!";
        });
        //3. Delivery
        CompletableFuture<String> shipOrder = CompletableFuture.supplyAsync(() -> {
            System.out.println("Shipping: Packing for shipping... (" + Thread.currentThread().getName() + ")");
            sleep(1500); //1.5s
            System.out.println("Shipping: Handed over to the shipping company!");
            return "Shipped!";
        });
        //use allOf()
        //allOf() will return a new CompletableFuture<Void>
        CompletableFuture<Void> allTasks = CompletableFuture.allOf(checkInventory, processPayment, shipOrder);
        allTasks.thenRun(() -> {
            long endTime = System.currentTimeMillis();
            System.out.println("All tasks completed!");
            System.out.println("The order has been processed!");
            System.out.println("Total time: " + (endTime - startTime) + " ms");
        });

        try {
            allTasks.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
