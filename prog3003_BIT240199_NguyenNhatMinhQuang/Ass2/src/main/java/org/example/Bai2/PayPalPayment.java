package org.example.Bai2;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " VNĐ in PayPal.");
    }
}
