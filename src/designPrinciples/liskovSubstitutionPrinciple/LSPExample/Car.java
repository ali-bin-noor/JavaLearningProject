package designPrinciples.liskovSubstitutionPrinciple.LSPExample;

public class Car extends EngineVehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started....");
    }

    @Override
    public void move() {
        System.out.println("Car started moving....");
    }
}
