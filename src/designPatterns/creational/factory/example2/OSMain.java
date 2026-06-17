package designPatterns.creational.factory.example2;

public class OSMain {
    public static void main(String[] args) {
        OperatingSystem OS = OperatingSystemFactory.getInstance("Linux", "11");
        OS.spec();

    }
}
