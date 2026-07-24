package designPrinciples.SingleResponsibilityPrinciple.withoutSRPExample;

public class BreadBaker {
    public void bakeBread(){
        System.out.println("Baking high-quality bread...");
    }

    public void manageInventory(){
        System.out.println("Managing inventory...");
    }

    public void orderSupplies(){
        System.out.println("Order supplies...");
    }

    public void serverCustomer(){
        System.out.println("Serving customer....");
    }

    public void cleanBakery(){
        System.out.println("Cleaning the bakery..");
    }

    public static void main(String[] args) {
        BreadBaker baker = new BreadBaker();
        baker.bakeBread();
        baker.manageInventory();
        baker.orderSupplies();
        baker.serverCustomer();
        baker.cleanBakery();
    }
}
