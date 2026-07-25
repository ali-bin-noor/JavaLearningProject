package designPrinciples.liskovSubstitutionPrinciple.withoutLSPExample;

public class Penguin implements Bird{
    @Override
    public void fly() {
        throw new RuntimeException("Penguin can't fly.....");
    }
}
