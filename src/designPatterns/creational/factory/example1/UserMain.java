package designPatterns.creational.factory.example1;

public class UserMain {
    public static void main(String[] args) {

        Object address = FactoryBean.getInstanceObject("user");
        System.out.println(address.toString());
    }
}
