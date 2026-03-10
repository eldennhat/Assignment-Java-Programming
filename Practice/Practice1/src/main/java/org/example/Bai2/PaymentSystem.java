package org.example.Bai2;

public class PaymentSystem {
    public static void main(String[] args) {
        System.out.println("\n-----------------");
        System.out.println("PAYMENT SYSTEM");

        Payment payment1 = PaymentFactory.getPaymentMethod("CreditCard");
        payment1.processPayment(500000);

        Payment payment2 = PaymentFactory.getPaymentMethod("PayPal");
        payment2.processPayment(150000);

        Payment payment3 = PaymentFactory.getPaymentMethod("Cash");
        payment3.processPayment(50000);
    }
}
