package designPrinciples.liskovSubstitutionPrinciple.LSPExample;

public class Bicycle extends NonEngineVehicle{
    @Override
    public void move() {
        System.out.println("Bicycle is moving...");
    }
    // Bicycle-specific methods
    // No need to implement engine-related methods
}
