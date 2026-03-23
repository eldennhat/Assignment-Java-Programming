package org.example.Bai2;

public class Notification {
    private MessageService messageService;

    // Setter Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notify(String message) {
        if (messageService != null) {
            messageService.sendMessage(message);
        } else {
            System.out.println("Lỗi: Chưa cài đặt dịch vụ gửi tin!");
        }
    }
}
