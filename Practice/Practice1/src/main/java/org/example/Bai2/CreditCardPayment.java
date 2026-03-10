package org.example.Bai2;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " VNĐ in Credit Card.");
    }
}
