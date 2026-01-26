package org.example.Bai5;

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email Service is sending: " + message);
    }
}
class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS Service is sending: " + message);
    }
}
//3.
class Notification {
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
    public void sendNotification(String msg) {
        if (messageService != null) {
            messageService.sendMessage(msg);
        } else {
            System.out.println("The messaging service has not been configured yet!");
        }
    }
}
//4.
public class Bai5 {
    public static void main(String[] args) {
        //1.emailservice
        Notification notify = new Notification();
        MessageService emailService = new EmailService();
        //inject emailservice
        notify.setMessageService(emailService);
        //send
        notify.sendNotification("Important notifications via email!!!");

        //2.SMSservice
        MessageService smsService = new SMSService();
        //inject smsservice
        notify.setMessageService(smsService);
        notify.sendNotification("Your OTP code is 1210");
    }
}
