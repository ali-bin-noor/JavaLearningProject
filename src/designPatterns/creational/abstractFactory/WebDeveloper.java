package designPatterns.creational.abstractFactory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 5000;
    }

    @Override
    public String name() {
        System.out.println("I am Web Developer.");
        return "Web Developer";
    }
}
