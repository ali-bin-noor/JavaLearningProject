package designPatterns.structural.adapter.smartHomeControllerExample;

import designPatterns.structural.adapter.smartHomeControllerExample.adapter.AirConditionerAdapter;
import designPatterns.structural.adapter.smartHomeControllerExample.adapter.CoffeeMachineAdapter;
import designPatterns.structural.adapter.smartHomeControllerExample.adapter.SmartLightAdapter;
import designPatterns.structural.adapter.smartHomeControllerExample.devices.AirConditioner;
import designPatterns.structural.adapter.smartHomeControllerExample.devices.CoffeeMachine;
import designPatterns.structural.adapter.smartHomeControllerExample.devices.SmartLight;

public class SmartHomeController {
    public static void main(String[] args) {
        // Create adapters for each device
        SmartDevice airConditioner = new AirConditionerAdapter(new AirConditioner());
        SmartDevice smartLight = new SmartLightAdapter(new SmartLight());
        SmartDevice coffeeMachine = new CoffeeMachineAdapter(new CoffeeMachine());

        // Control devices through the unified interface
        airConditioner.turnOn();
        smartLight.turnOn();
        coffeeMachine.turnOn();
        airConditioner.turnOff();
        smartLight.turnOff();
        coffeeMachine.turnOff();

    }
}
