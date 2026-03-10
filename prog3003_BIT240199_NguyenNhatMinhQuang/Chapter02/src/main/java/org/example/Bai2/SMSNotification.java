package org.example.Bai2;

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS message: Hi!");
    }
}
class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending email: Detail email...");
    }
}
class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a Push Notification: Ting ting!");
    }
}