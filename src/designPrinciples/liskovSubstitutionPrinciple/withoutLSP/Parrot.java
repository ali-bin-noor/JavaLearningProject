package designPrinciples.liskovSubstitutionPrinciple.withoutLSP;

public class Parrot implements Bird{
    @Override
    public void fly() {
        System.out.println("Parrot can fly.....");
    }
}
