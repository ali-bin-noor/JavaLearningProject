package designPatterns.structural.proxy.example1;

public class DataServiceProxy implements DataService{

    private RealDataService realDataService;
    private String role;


    public DataServiceProxy(String role){
        this.role=role;
    }


    @Override
    public void fetchData() {
        //Logging
        System.out.println("Request received for data");

        //security check
        if(!role.equalsIgnoreCase("ADMIN")){
            System.out.println("Access Denied");
            return;
        }

        //Lazy initialization(Virtual Proxy concept)
        if(realDataService==null){
            realDataService = new RealDataService();
        }
        realDataService.fetchData();
    }
}
