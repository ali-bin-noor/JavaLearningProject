package designPatterns.behavioral.observer;

public class TVDisplay implements Observer{

    @Override
    public void getNotification(int temperature) {

        System.out.println("TV Display Temperature updated : "+temperature+"C");
    }
}
