package designPatterns.structural.bridge;

public class BasicRemote extends RemoteControl{

    public BasicRemote(Device device){
        super(device);
    }
    @Override
    void power() {
        System.out.println("Basic Remote power toggle");
        device.turnOn();
    }
}
