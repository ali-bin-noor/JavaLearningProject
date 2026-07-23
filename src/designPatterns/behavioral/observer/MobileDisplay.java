package designPatterns.behavioral.observer;

public class MobileDisplay implements Observer{

    @Override
    public void getNotification(int temperature) {

        System.out.println("Mobile Display Temperature updated : "+temperature+"C");
    }
}
