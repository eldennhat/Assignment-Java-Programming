package org.example.Bai2;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();

        notification.setMessageService(new EmailService());
        notification.notify("Xin chào qua Email!");

        notification.setMessageService(new SMSService());
        notification.notify("Mã OTP của bạn là 121006");
    }
}
