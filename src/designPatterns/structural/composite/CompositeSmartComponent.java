package designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite class for groups of components
public class CompositeSmartComponent implements SmartComponent {

    private List<SmartComponent> components = new ArrayList<>();

    public void addComponent(SmartComponent smartComponent) {
        components.add(smartComponent);
    }


    public void removeComponent(SmartComponent smartComponent) {
        components.remove(smartComponent);
    }


    @Override
    public void turnOn() {
        for (SmartComponent component : components) {
            component.turnOn();
        }
    }

    @Override
    public void turnOff() {
        for (SmartComponent component : components) {
            component.turnOff();
        }
    }
}
