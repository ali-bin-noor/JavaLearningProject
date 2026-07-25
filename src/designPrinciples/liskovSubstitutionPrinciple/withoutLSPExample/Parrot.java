package designPrinciples.liskovSubstitutionPrinciple.withoutLSPExample;

public class Parrot implements Bird{
    @Override
    public void fly() {
        System.out.println("Parrot can fly.....");
    }
}
