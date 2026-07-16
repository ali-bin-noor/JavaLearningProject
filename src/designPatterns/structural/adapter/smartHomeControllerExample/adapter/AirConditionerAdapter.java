package designPatterns.structural.adapter.smartHomeControllerExample.adapter;

import designPatterns.structural.adapter.smartHomeControllerExample.devices.AirConditioner;
import designPatterns.structural.adapter.smartHomeControllerExample.SmartDevice;

// Adapter for Air Conditioner
public class AirConditionerAdapter implements SmartDevice {
    private AirConditioner airConditioner;

    // Constructor
    public AirConditionerAdapter(AirConditioner airConditioner){
        this.airConditioner=airConditioner;
    }

    @Override
    public void turnOn() {
        airConditioner.connectViaBluetooth();
        airConditioner.startCooling();

    }

    @Override
    public void turnOff() {
    airConditioner.stopCooling();
    airConditioner.disconnectBluetooth();
    }
}
