package designPrinciples.dependencyInversionPrinciple.withoutDIPExample;

public class DemoMain {
    public static void main(String[] args) {
        NotificationManager notificationManager = new NotificationManager();
        notificationManager.notifyUser("Payment successful.");
    }
}
