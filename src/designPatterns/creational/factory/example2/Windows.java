package designPatterns.creational.factory.example2;

public class Windows implements OperatingSystem {

    private String version;

    public Windows(String version) {
        this.version = version;
    }

    @Override
    public void spec() {
        System.out.println("Windows OS version : "+version);
    }
}
