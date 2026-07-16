package designPatterns.structural.adapter.smartHomeControllerExample.devices;

// SmartLight.java - Device using Wi-Fi for communication
public class SmartLight {

    //Method to connect the smart Light to wi-fi
    public void connectWifi(){
        System.out.println("Smart Light connected to Wi-fi.");
    }


    //Method to turn on Smart Light
    public void switchOn(){
        System.out.println("Smart Light is now ON.");
    }

    //Method to disconnect Wi-Fi connection
    public void switchOff(){
        System.out.println("Smart Light is now OFF.");
    }

    //Method to disconnect Wi-Fi connection
    public void disconnectWiFi(){
        System.out.println("Smart Light disconnected from Wi-fi");
    }
}
