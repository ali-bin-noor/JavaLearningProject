package designPatterns.creational.factory.example2;

public class OperatingSystemFactory {

    private OperatingSystemFactory(){};

    public static OperatingSystem  getInstance(String type,String version){

        if(type.equalsIgnoreCase("WINDOWS")){
            return new Windows(version);
        } else if (type.equalsIgnoreCase("LINUX")) {
            return new Linux(version);
        }
        throw new IllegalArgumentException("Invalid OS type");
    }

}
