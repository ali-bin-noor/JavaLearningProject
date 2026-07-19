package designPatterns.structural.proxy.example1;

public class RealDataService implements DataService {
    @Override
    public void fetchData() {
        System.out.println("Fetching sensitive data from DB......");
    }
}
