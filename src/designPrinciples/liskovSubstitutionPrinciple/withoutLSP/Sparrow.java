package designPrinciples.liskovSubstitutionPrinciple.withoutLSP;

public class Sparrow implements Bird{
    @Override
    public void fly() {
        System.out.println("Sparrow can fly.....");
    }
}
