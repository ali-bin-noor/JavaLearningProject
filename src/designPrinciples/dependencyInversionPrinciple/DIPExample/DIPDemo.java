package designPrinciples.dependencyInversionPrinciple.DIPExample;

public class DIPDemo {
    public static void main(String[] args) {
        NotificationManager emailService = new NotificationManager(new EmailService());
        NotificationManager smsService = new NotificationManager(new SMSService());
        NotificationManager whatsAppService = new NotificationManager(new WhatApp());

        emailService.notifyUser("Payment successful.");
        smsService.notifyUser("Payment successful.");
        whatsAppService.notifyUser("Payment successful.");
    }
}
