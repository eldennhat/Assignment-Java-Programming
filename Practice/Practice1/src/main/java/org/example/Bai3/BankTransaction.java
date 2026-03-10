package org.example.Bai3;
import java.util.concurrent.CompletableFuture;

public class BankTransaction {
    public static void main(String[] args) {
        System.out.println("\n--------------------------");
        System.out.println("STARTING TRANSACTION");
        boolean isAuthValid = true;
        boolean hasEnoughBalance = true;

        CompletableFuture.supplyAsync(() -> {
            System.out.println("1. Authenticating customer information...");
            sleep(1000);

            if (!isAuthValid) {
                throw new RuntimeException("Authentication failed!");
            }
            System.out.println("-> Authentication successful.");
            return "AUTH_OK";

        }).thenApply(authResult -> {
            System.out.println("2. Checking account balance...");
            sleep(1500);

            if (!hasEnoughBalance) {
                throw new RuntimeException("Insufficient account balance!");
            }
            System.out.println("-> Balance is sufficient.");
            return "BALANCE_OK";

        }).thenAccept(balanceResult -> {
            System.out.println("3. Processing money transfer...");
            sleep(1000);

            System.out.println("-> TRANSFER SUCCESSFUL! Transaction completed.");

        }).exceptionally(ex -> {
            System.err.println("!!! TRANSACTION CANCELLED !!! Error: " + ex.getCause().getMessage());
            return null;
        });
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void sleep(int ms) {
        try { Thread.sleep(ms); }
        catch (InterruptedException e) { e.printStackTrace(); }
    }
}