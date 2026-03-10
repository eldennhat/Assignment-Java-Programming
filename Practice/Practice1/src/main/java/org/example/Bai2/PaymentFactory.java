package org.example.Bai2;

public class PaymentFactory {
    public static Payment getPaymentMethod(String type) {
        if (type == null) {
            return null;
}
        switch (type.toUpperCase()) {
            case "CREDITCARD":
                return new CreditCardPayment();
            case "PAYPAL":
                return new PayPalPayment();
            case "CASH":
                return new CashPayment();
            default:
                throw new IllegalArgumentException("Payment method is not supported: " + type);
        }
    }
}
