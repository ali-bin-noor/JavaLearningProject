package designPatterns.structural.proxy.example1;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        DataServiceProxy user = new DataServiceProxy("USER");
        user.fetchData();

        System.out.println("-------------------------------");

        DataServiceProxy admin = new DataServiceProxy("ADMIN");
        admin.fetchData();
    }
}
