package org.example.Bai3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        System.out.println("He Thong Dat Ve Xem Phim");

        CompletableFuture<String> authTask = CompletableFuture.supplyAsync(() -> {
            System.out.println("Dang xac thuc khach hang (" + Thread.currentThread().getName() + ")");
            sleep(1500);
            System.out.println("Hoan thanh xac thuc!");
            return "Khach hang hop le";
        });
        CompletableFuture<String> ticketTask = CompletableFuture.supplyAsync(() -> {
            System.out.println("Dang chuan bi xuat ve(" + Thread.currentThread().getName() + ")");
            sleep(2000);
            System.out.println("Da chuan bi ve xong!");
            return "Ve Interstellar (ghe VIP)";
        });

        CompletableFuture<String> combinedTask = authTask.thenCombine(ticketTask, (authResult, ticketResult) -> {
            return "Ket qua: " + authResult + " | Da cap: " + ticketResult;
        });

        try {
            String finalResult = combinedTask.get();
            System.out.println("Hoan thanh giao dich!");
            System.out.println(finalResult);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void sleep(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
