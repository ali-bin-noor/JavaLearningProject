package designPrinciples.liskovSubstitutionPrinciple.LSPExample;

public class LSPDemo {
    public static void main(String[] args) {
        EngineVehicle car = new Car();
        NonEngineVehicle bicycle = new Bicycle();

        car.move();
        car.startEngine();

        bicycle.move();
    }
}
