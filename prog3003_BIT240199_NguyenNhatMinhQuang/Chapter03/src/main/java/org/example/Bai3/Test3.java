package org.example.Bai3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Start processing asynchronous operations...");
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("B1: Creating data... (" + Thread.currentThread().getName() + ")");
            sleep(500);
            return new Integer[]{1, 2, 5, 3, 100, 7, 4, 9, 8};
            //b2
        })
                .thenApply(numbers -> {
                    System.out.println("B2: Filtering and sorting in progress... (" + Thread.currentThread().getName() + ")");
                    List<Integer> sortedNum = Arrays.stream(numbers)
                            .filter(n -> n % 2 != 0)
                            .sorted()
                            .collect(Collectors.toList());
                    return sortedNum;
                })
                .thenApply(list -> {
                    System.out.println("B3: Formatting string... (" + Thread.currentThread().getName() + ")");
                    return "The result are: " + list.toString();
                })
                //B4
                .thenAccept(finalResult -> {
                    System.out.println("B4: Complete!!!");
                    System.out.println(finalResult);
                });
                future.join();
    }
    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
