package org.example.Bai2;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Gửi Email: " + message);
    }
}
