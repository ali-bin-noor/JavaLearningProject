package designPrinciples.liskovSubstitutionPrinciple.withoutLSP;

public class Penguin implements Bird{
    @Override
    public void fly() {
        throw new RuntimeException("Penguin can't fly.....");
    }
}
