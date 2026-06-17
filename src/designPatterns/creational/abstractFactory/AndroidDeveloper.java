package designPatterns.creational.abstractFactory;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        return 10000;
    }

    @Override
    public String name() {
        System.out.println("I am Android Developer.");
        return "Android Developer";
    }
}
