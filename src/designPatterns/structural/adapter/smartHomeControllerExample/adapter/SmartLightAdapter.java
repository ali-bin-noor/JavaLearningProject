package designPatterns.structural.adapter.smartHomeControllerExample.adapter;

import designPatterns.structural.adapter.smartHomeControllerExample.SmartDevice;
import designPatterns.structural.adapter.smartHomeControllerExample.devices.SmartLight;

// Adapter for Smart Light
public class SmartLightAdapter implements SmartDevice {
    private SmartLight smartLight;

    public SmartLightAdapter(SmartLight smartLight){
        this.smartLight=smartLight;
    }

    @Override
    public void turnOn() {
        smartLight.connectWifi();
        smartLight.switchOn();
    }

    @Override
    public void turnOff() {
        smartLight.disconnectWiFi();
        smartLight.switchOff();
    }
}
