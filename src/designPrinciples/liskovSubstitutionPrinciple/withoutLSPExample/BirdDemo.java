package designPrinciples.liskovSubstitutionPrinciple.withoutLSPExample;

public class BirdDemo {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird parrot = new Parrot();
        Bird penguin = new Penguin();

        sparrow.fly();
        parrot.fly();
        penguin.fly();// this violets LSP principle

    }
}
