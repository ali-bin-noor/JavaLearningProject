package designPrinciples.dependencyInversionPrinciple.withoutDIPExample;

public class NotificationManager {
    private EmailService emailService = new EmailService();//this violets DIP
    //But tomorrow the business says, Send SMS instead.
    //Later WhatsApp, Again modify. Push Notification Again modify.
    //Every new notification channel forces changes to the high-level class.
    //This violates both OCP and DIP.

    public void notifyUser(String message){
        emailService.send(message);
    }


}
