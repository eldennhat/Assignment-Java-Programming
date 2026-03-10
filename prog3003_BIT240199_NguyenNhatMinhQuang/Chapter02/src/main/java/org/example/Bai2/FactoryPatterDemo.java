package org.example.Bai2;

public class FactoryPatterDemo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification notify1 = factory.createNotification("SMS");
        if (notify1 != null) {
            notify1.notifyUser();
        }

        Notification notify2 = factory.createNotification("EMAIL");
        if (notify2 != null) {
            notify2.notifyUser();
        }

        Notification notify3 = factory.createNotification("PUSH");
        if (notify3 != null) {
            notify3.notifyUser();
        }
    }
}
