package designPatterns.behavioral.observer;

public class LaptopDisplay implements Observer{

    @Override
    public void getNotification(int temperature) {

        System.out.println("Laptop Display Temperature updated : "+temperature+"C");
    }
}
