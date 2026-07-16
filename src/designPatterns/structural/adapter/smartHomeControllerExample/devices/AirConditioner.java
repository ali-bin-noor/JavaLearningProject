package designPatterns.structural.adapter.smartHomeControllerExample.devices;

// AirConditioner.java - Device using Bluetooth for communication
public class AirConditioner {

    // Method to connect to the Air Conditioner via Bluetooth
    public void connectViaBluetooth(){
        System.out.println("Air Conditioner connected via Bluetooth.");
    }

    //Method to start cooling process
    public void startCooling(){
        System.out.println("Air Conditioner is now cooling.");
    }

    //Method to stop the cooling process
    public void stopCooling(){
        System.out.println("Air Conditioner stopped cooling.");
    }

    //Method to disconnect Bluetooth connection
    public void disconnectBluetooth(){
        System.out.println("Air Conditioner disconnected from Bluetooth.");
    }
}
