package org.example.Bai4;
//2.
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Payment completed " + amount + " VND using credit card: " + cardNumber);
    }
}
//paypalPayment
class PayPalPayment implements PaymentStrategy {
    private String email;
    public PayPalPayment(String email) {
        this.email = email;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Payment completed $" + amount + " using PayPal: " + email);
    }
}
//3.
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Error: Payment method not selected!");
            return;
        }
        paymentStrategy.pay(amount);
    }
}

public class Bai4 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        System.out.println("Payment 1");
        cart.setPaymentStrategy(new CreditCardPayment("1210-2726-1552-1234"));
        cart.checkout(500000);

        System.out.println("Payment 2");
        cart.setPaymentStrategy(new PayPalPayment("elden@gmai.com"));
        cart.checkout(2500);
    }
}
