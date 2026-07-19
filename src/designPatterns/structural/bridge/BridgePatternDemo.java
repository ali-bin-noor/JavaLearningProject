package designPatterns.structural.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl tvRemoteControl = new AdvanceRemoteControl(tv);
        tvRemoteControl.power();
        ((AdvanceRemoteControl) tvRemoteControl).mute();

        Radio radio = new Radio();
        RemoteControl radioBasicRemote = new BasicRemote(radio);
        radioBasicRemote.power();

    }
}
