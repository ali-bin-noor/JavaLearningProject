package designPatterns.creational.abstractFactory;

public class MainApplication {

    public static void main(String[] args) {

        //Android developer
        Employee androidDeveloper = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println("My name is : "+androidDeveloper.name()+ " and my salary is : "+androidDeveloper.salary());

        //Web developer
        Employee webDeveloper = EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println("My name is : "+webDeveloper.name()+ " and my salary is : "+webDeveloper.salary());

    }
}
