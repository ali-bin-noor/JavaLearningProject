package designPrinciples.liskovSubstitutionPrinciple.withoutLSPExample;

public class Sparrow implements Bird{
    @Override
    public void fly() {
        System.out.println("Sparrow can fly.....");
    }
}
