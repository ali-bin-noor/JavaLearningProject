package designPatterns.creational.factory.example2;

public class Linux implements OperatingSystem{
    private String version;

    public Linux(String version) {
        this.version = version;
    }

    @Override
    public void spec() {
        System.out.println("Linux OS version : "+version);
    }
}
