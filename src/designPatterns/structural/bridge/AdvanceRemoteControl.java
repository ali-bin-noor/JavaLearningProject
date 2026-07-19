package designPatterns.structural.bridge;

public class AdvanceRemoteControl extends RemoteControl{

    public AdvanceRemoteControl(Device device){
        super(device);
    }
    @Override
    void power() {
        System.out.println("Advance Remote Power toggle.");
        device.turnOn();
    }

    public void mute() {
        device.setVolume(0);
    }
}
