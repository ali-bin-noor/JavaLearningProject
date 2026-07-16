package designPatterns.structural.adapter.smartHomeControllerExample.adapter;

import designPatterns.structural.adapter.smartHomeControllerExample.SmartDevice;
import designPatterns.structural.adapter.smartHomeControllerExample.devices.CoffeeMachine;

public class CoffeeMachineAdapter implements SmartDevice {
    private CoffeeMachine coffeeMachine;
    public CoffeeMachineAdapter(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void turnOn() {
        coffeeMachine.initializeZigbeeConnection();
        coffeeMachine.startBrewing();
    }

    @Override
    public void turnOff() {
        coffeeMachine.stopBrewing();
        coffeeMachine.terminateZigbeeConnection();
    }
}
